// Subtract the Product and Sum of Digits of an Integer <Leetcode Problem 1281>
// Given an integer number n, return the difference between the product of its digits and the sum of its digits. 

/*
Sample:
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
*/

//code 
class Solution {
    public int subtractProductAndSum(int n) {
       int reverse=0,sum=0,product=1;
		int temp=n;
		//for sum
		while(temp>0) {
			reverse=temp%10;
			sum+=reverse;
			temp/=10;
		}
		//for multiply
		
		while(n>0) {
			reverse=n%10;
			product*=reverse;
			n/=10;
		}
     //returning the difference
		return (product-sum); 
        
    }
    
}
