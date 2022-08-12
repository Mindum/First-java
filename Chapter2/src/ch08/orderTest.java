package ch08;



public class orderTest {

	public static void main(String[] args) {
		
		order myOrder = new order();
		myOrder.orderNumber = "202011020003";
		myOrder.orderpNumber = "01023450001";
		myOrder.orderadress = "경기도 안산시 와동 95";
		myOrder.orderDate = "20201102";
		myOrder.orderTime = "130258";
		myOrder.orderPrice = "35000";
		myOrder.menuNumber = "0003";
		
		
		myOrder.showOrder();
	}

}
