package com.blz.LineComparison;

 import java.util.Scanner;

   public class LineComparison {
	   public static int x1,x2,y1,y2,x3,x4,y3,y4;
       public static void main(String[] args) {
			getInput();
			CalculateLength cal = new CalculateLength();
			cal.calLength();
			CheckEquality check = new CheckEquality();
			check.checkEquality();
		}
	  public static void getInput() {
			Scanner sc = new Scanner(System.in);
			System.out.println("For given line");
			System.out.println("Enter co-ordinates of x1 and y1");
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			System.out.println("Enter co-ordinates of x2 and y2");
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			System.out.println("For second line");
			System.out.println("Enter co-ordinates of x3 and y3");
			x3 = sc.nextInt();
			y3 = sc.nextInt();
			System.out.println("Enter co-ordinates of x4 and y4");
			x4 = sc.nextInt();
			y4 = sc.nextInt();
		}
	}
class CalculateLength{
	   static Double length1,length2;
	   public void calLength() {
			    length1 = Math.sqrt((LineComparison.x2 - LineComparison.x1) * (LineComparison.x2 - LineComparison.x1) + (LineComparison.y2 - LineComparison.y1) * (LineComparison.y2 - LineComparison.y1));
				System.out.println("Length of first line = "+length1+" units");
			    length2 = Math.sqrt((LineComparison.x4 - LineComparison.x3) * (LineComparison.x4 - LineComparison.x3) + (LineComparison.y4 - LineComparison.y3) * (LineComparison.y4 - LineComparison.y3));
				System.out.println("Length of second line = "+length2+" units");
			}
	}
class CheckEquality{
	  public  void checkEquality() {
				if(CalculateLength.length1.equals(CalculateLength.length2)) {
					System.out.println("Both lines are EQUAL in length");
				}
				else {
					System.out.println("Both lines are NOT EQUAL in length");
				}
			}
	}

   
	    
