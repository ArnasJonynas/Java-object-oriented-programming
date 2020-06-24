class Boat {

	private String boatName;
	private double maxWeight;
	private int noOfBoxes=0;
	private doouble totalWeight=0;
	private CargoBoxe[] boxes = new CargoBoxe[10];

void setValues (String bName, double mWeight){
	boatName = bname;
	maxWeight = mWeight;
}
int getnoOfBoxes(){
	return noOfBoxes;	
}
String getboatName(){
	return boatName;
}
double getmaxWeight(){
	return maxWeight;
}
double gettotalWeight(){
	return totalWeight;
}
boolean addCargoBox (CargoBox box){
if ( (box.getWeight() + totalWeight) < maxWeight && noOfBoxes < boxes.length ){
	boxes[noOfboxes]=box;
	noOfboxes++;
	totalWeight = totalWeight + box.getWeight();
	return true;
}   return false;

}
	void printCargoBoxes(){
		for (int i=0; i < noOfBoxes; i++)
		{
			CargoBoxe box = boxes [i];
		System.out.println( i + " " + box);
		}
}
public void toString(){
	return boatName + "" + totalWeight + " " + maxWeight;
}

}