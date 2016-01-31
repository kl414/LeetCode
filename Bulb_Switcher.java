/**
 * Trickly problem lol
 * the ith bulb will get switch on d round when d divides i
 * So the idea is the bulb can only be on 
 * if and only if there is odd number of factors for that number
 * which are squre numbers
 */
public class Solution {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);   
    }
}
