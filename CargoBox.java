class CargoBox {
private String itemName ;
private int itemQuantity;
private double weightPerItem; 

void setValues ( String Name, int Quantity, double WperItem){
	itemName = Name;
	itemQuantity = Quantity;
	weightPerItem= WperItem;

}
 String getName (){
	return itemName;
 }
 int getQuantity(){
	return itemQuantity;
 }
 double getWperItem(){
	return weightPerItem;
 }	
double getWeight(){
	return itemQuantity * weightPerItem;
}
String toString(){
	return itemName +" " + itemQuantity + " " +weightPerItem ;
}

}