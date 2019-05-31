
public class UniqueSum {
	public static int  NumbersSum =0;
 public static int uniqueSumCal(int firstNum, int secondNum, int thirdNum) {
	 if(firstNum == secondNum && firstNum != thirdNum) {
		 NumbersSum = firstNum + thirdNum;
	 } 
	 else if(firstNum != secondNum && secondNum == thirdNum) {
		 NumbersSum = firstNum + secondNum;
	 }
	 else if(secondNum != thirdNum &&  secondNum == firstNum ) {
		 NumbersSum = secondNum + thirdNum;
	 }else if(secondNum != thirdNum &&  secondNum != firstNum) {
		 NumbersSum = firstNum+ secondNum + thirdNum;
	 }
	 
	 return NumbersSum;
 }

}
