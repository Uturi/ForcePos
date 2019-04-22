﻿package com.kitri.pos.db;

public class PosDto {

	// 필드 선언

	private int user_code; // 유저코드
	private String name; // 이름
	private String attendCode; // 출결코드
	private String loginTime; // 출근시간
	private String logoutTime; // 퇴근시간
	private String workTime; // 근무시간
	private String pw; // 패스워드
	private String id; // 아이디
	private String authority; // 권한
	// ===================================//
	private String cooperateName; // 제휴사
	private String company; // 제조사
	private String productCode; // 상품코드
	private String productName; // 상품이름
	private String levelCode; // 분류코드
	private String majorLevel; // 대분류
	private String mediumLevel; // 중분류
	private String minorLevel; // 소분류
	private int price; // 가격
	private int purchase; // 매입가
	private int volume; // 수량
	private String realExp; // 유통기한
	private String exp;
	private String expName;
	
	public int getUser_code() {
		return user_code;
	}

	public void setUser_code(int user_code) {
		this.user_code = user_code;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getExpName() {
		return expName;
	}

	public void setExpName(String expName) {
		this.expName = expName;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getPricensellCount() {
		return pricensellCount;
	}

	public void setPricensellCount(int pricensellCount) {
		this.pricensellCount = pricensellCount;
	}

	public int getListNum() {
		return listNum;
	}

	public void setListNum(int listNum) {
		this.listNum = listNum;
	}

	public int getProductSellPrice() {
		return productSellPrice;
	}

	public void setProductSellPrice(int productSellPrice) {
		this.productSellPrice = productSellPrice;
	}

	public String getProductSellCount() {
		return productSellCount;
	}

	public void setProductSellCount(String productSellCount) {
		this.productSellCount = productSellCount;
	}

	// ===================================//
	private String sellId; // 판매아이디
	private String sellDate; // 판매일자
	private int sellCount; // 판매수량
	private String countDate; // 정산날짜
	private int comsCalc; // 현금결제금액
	private int cashPrice;
	private float discountPct; // 할인율
	private int currentMoney; // 현재시제
	private int totalCalc; // 차액
	private String phone; // 핸드폰번호
	private int point; // 포인트
	private String payment;
	private int cardPrice; // 카드결제금액
	private String inDate; // 입고날짜
	private int totalPrice;
	private String discountCode; // 할인코드
	private String membershipId; // 맴버쉽아이디
	private String memberName; //멤버쉽 회원 이름
	private int pricensellCount;
	private int listNum; // 상품등록창에서 행번호@@@@
	private int productSellPrice; //판매 상품 목록의 상품별 총 가격(테이블의 오른쪽 열)
	private String productSellCount; //수량변경시 오류로, 상품보류용 상품별 개수 따로 저장
	
	// =====================================//
	private int ranking;           // 매출순위
	private int statTotalPrice;   // 매출합계
	private int totalTax;           // 부가세합계
	private int customerCount; // 고객수
	private String sellTime; //판매시간

	public int getUserCode() {
		return user_code;
	}

	public void setUserCode(int user_code) {
		this.user_code = user_code;
	}

	public String getSellTime() {
		return sellTime;
	}

	public void setSellTime(String sellTime) {
		this.sellTime = sellTime;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public int getStatTotalPrice() {
		return statTotalPrice;
	}

	public void setStatTotalPrice(int statTotalPrice) {
		this.statTotalPrice = statTotalPrice;
	}

	public int getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(int totalTax) {
		this.totalTax = totalTax;
	}

	public int getCustomerCount() {
		return customerCount;
	}

	public void setCustomerCount(int customerCount) {
		this.customerCount = customerCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getAttendCode() {
		return attendCode;
	}

	public void setAttendCode(String attendCode) {
		this.attendCode = attendCode;
	}

	public String getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}

	public String getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(String logoutTime) {
		this.logoutTime = logoutTime;
	}

	public String getWorkTime() {
		return workTime;
	}

	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getCooperateName() {
		return cooperateName;
	}

	public void setCooperateName(String cooperateName) {
		this.cooperateName = cooperateName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	public String getMajorLevel() {
		return majorLevel;
	}

	public void setMajorLevel(String majorLevel) {
		this.majorLevel = majorLevel;
	}

	public String getMediumLevel() {
		return mediumLevel;
	}

	public void setMediumLevel(String mediumLevel) {
		this.mediumLevel = mediumLevel;
	}

	public String getMinorLevel() {
		return minorLevel;
	}

	public void setMinorLevel(String minorLevel) {
		this.minorLevel = minorLevel;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPurchase() {
		return purchase;
	}

	public void setPurchase(int purchase) {
		this.purchase = purchase;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getRealExp() {
		return realExp;
	}

	public void setRealExp(String realExp) {
		this.realExp = realExp;
	}

	public String getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(String membershipId) {
		this.membershipId = membershipId;
	}

	public String getSellId() {
		return sellId;
	}

	public void setSellId(String sellId) {
		this.sellId = sellId;
	}

	public String getSellDate() {
		return sellDate;
	}

	public void setSellDate(String sellDate) {
		this.sellDate = sellDate;
	}

	public int getSellCount() {
		return sellCount;
	}

	public void setSellCount(int sellCount) {
		this.sellCount = sellCount;
	}

	public String getCountDate() {
		return countDate;
	}

	public void setCountDate(String countDate) {
		this.countDate = countDate;
	}

	public int getComsCalc() {
		return comsCalc;
	}

	public void setComsCalc(int comsCalc) {
		this.comsCalc = comsCalc;
	}

	public int getCashPrice() {
		return cashPrice;
	}

	public void setCashPrice(int cashPrice) {
		this.cashPrice = cashPrice;
	}

	public float getDiscountPct() {
		return discountPct;
	}

	public void setDiscountPct(float discountPct) {
		this.discountPct = discountPct;
	}

	public int getCurrentMoney() {
		return currentMoney;
	}

	public void setCurrentMoney(int currentMoney) {
		this.currentMoney = currentMoney;
	}

	public int getTotalCalc() {
		return totalCalc;
	}

	public void setTotalCalc(int totalCalc) {
		this.totalCalc = totalCalc;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public int getCardPrice() {
		return cardPrice;
	}

	public void setCardPrice(int cardPrice) {
		this.cardPrice = cardPrice;
	}

	public String getInDate() {
		return inDate;
	}

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

}