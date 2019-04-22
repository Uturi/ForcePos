﻿package com.kitri.pos.account;

import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

import com.kitri.pos.ForcePos;
import com.kitri.pos.db.*;


//유저등록할때 받아야하는 값
//유저 ID, 유저 패스워드, 이름 , 권한

public class UserDao {

	
	
	public PosDto userDto;
	// DB연결시 필요
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	// 기본생성자
	public UserDao() {

	}

	// 로그인 대상 검색
	public boolean pass(String id, String pw) {
		boolean flag = false;
		con = DBManager.getConnection();

		try {

			String select = "SELECT user_code, pw, id, authority FROM members where id = ? and pw = ?";
			ps = con.prepareStatement(select);

			ps.setString(1, id);
			ps.setString(2, pw);
	
			rs = ps.executeQuery();

			while (rs.next()) {
			
				userDto = new PosDto();
				
				userDto.setUserCode(rs.getInt(1));
				userDto.setPw(rs.getString(2));
				userDto.setId(rs.getString(3));
				userDto.setAuthority(rs.getString(4));
				
				flag = true;
			}
			ForcePos.usercodeDto.setUserCode(userDto.getUserCode());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DBManager.dbClose(rs, ps, con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}

	// 리스트에 담은 값들을 얻어온다.

	// 회원 검색
	public Vector<PosDto> getMemberList() {
		// 보여지는 테이블에 넣는 값들 : 유저코드, 패스워드, 아이디, 권한, 이름
		Vector<PosDto> row = new Vector<PosDto>();

		con = DBManager.getConnection();

		String select = "select * " + 
						" from members " + 
						" order by user_code asc";

		try {

			ps = con.prepareStatement(select);
			rs = ps.executeQuery();

			while (rs.next()) {

				int USER_CODE_SEQ = rs.getInt(1);
				String pw = rs.getString(2);
				String id = rs.getString(3);
				String authority = rs.getNString(4);
				String name = rs.getString(5);

				userDto = new PosDto();

				userDto.setUserCode(USER_CODE_SEQ);
				userDto.setPw(pw);
				userDto.setId(id);
				userDto.setAuthority(authority);
				userDto.setName(name);

				row.add(userDto);
			}

		} catch (SQLException e1) {
			System.out.println("테이블 출력 오류");
			e1.printStackTrace();
		} finally {
			try {
				DBManager.dbClose(rs, ps, con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
	}

	// 회원수정
	public boolean updateMember(PosDto userDto) throws SQLException {

		boolean result = false;

		con = DBManager.getConnection();

		String update = "update members set name = ?, pw = ?, authority = ? where id = ?";

		try {

			ps = con.prepareStatement(update);

			ps.setString(1, userDto.getName());
			ps.setString(2, userDto.getPw());
			ps.setString(3, userDto.getAuthority());
			ps.setString(4, userDto.getId());

			int r = ps.executeUpdate();

			if (r > 0) {
				System.out.println("DB 수정이 완료되었습니다.");
				result = true;
			}
		} catch (SQLException e) {
			System.out.println("DB 수정이 실패했습니다.");
			e.printStackTrace();
		} finally {
			DBManager.dbClose(ps, con);
		}
		return result;
	}

	public void userSelectAll(DefaultTableModel tm) throws SQLException {

		con = DBManager.getConnection();

		String select = "SELECT *\r\n" + 
				"FROM MEMBERS\r\n" + 
				"WHERE COL = 'T'\r\n" + 
				"order by USER_CODE ";

		try {
			ps = con.prepareStatement(select);
			rs = ps.executeQuery();

			//테이블 모델 행 초기화 
			for (int i = 0; i < tm.getRowCount();) {
				tm.removeRow(i);
			}

			while (rs.next()) {
				Object data[] = {
					rs.getInt(1), 
					rs.getString(2), 
					rs.getString(3), 
					rs.getString(4), 
					rs.getString(5)
				};
				tm.addRow(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.dbClose(ps, con);
		}
	}

	// 회원정보삭제
	public boolean deleteMember(String id) throws SQLException {

		boolean result = false;

		con = DBManager.getConnection();

		String delete = "update " + 
						"members "+ 
						"set col = 'F' " + 
						"where id = ?";

		try {

			ps = con.prepareStatement(delete);

			ps.setString(1, id);

			int rows = ps.executeUpdate();
			System.out.println(rows);

			if (rows > 0) {
				result = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.dbClose(ps, con);
		}
		return result;
	}

	// 회원등록
	public boolean insertMember(PosDto userdto) throws SQLException {

		boolean result = false;

		con = DBManager.getConnection();

		String insert = "insert into members(user_code, pw, id, authority, name) " + 
						"values(USER_CODE_SEQ.NEXTVAL, ?, ?, ?, ?)";
		try {

			ps = con.prepareStatement(insert);

			ps.setString(1, userdto.getPw());
			ps.setString(2, userdto.getId());
			ps.setString(3, userdto.getAuthority());
			ps.setString(4, userdto.getName());

			int r = ps.executeUpdate(); // �떎�뻾 >> ���옣

			if (r > 0) {
				System.out.println("회원가입 성공  ");
				result = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.dbClose(ps, con);
		}
		return result;
	}
}