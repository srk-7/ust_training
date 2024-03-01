import java.util.*;
public class TheaterSeat 
{
    public static void main(String[] args) 
    {
        String[][] seats = {
            {"A1", "A2", "A3", "A4", "A5", "A6"},
            {"B1", "B2", "B3", "B4", "B5", "B6"},
            {"C1", "C2", "C3", "C4", "C5", "C6"},
            {"D1", "D2", "D3", "D4", "D5", "D6"},
            {"E1", "E2", "E3", "E4", "E5", "E6"},
            {"F1", "F2", "F3", "F4", "F5", "F6"}
        };
        String s = "a2";
        String seat = s.toUpperCase();
        String row = seat.substring(0, 1);
        int number = Integer.parseInt(seat.substring(1));
        int price=0;
        if (row.equals("A")) 
        {
            price = 200;
        } 
        else if (row.equals("B")) 
        {
            price = 100;
        } 
        else if (row.equals("C")) 
        {
            price = 75;
        } 
        else if (row.equals("D")) 
        {
            price = 50;
        } 
        else if (row.equals("E")) 
        {
            price = 40;
        } 
        else if (row.equals("F")) 
        {
            price = 30;
        }
        System.out.println(seat + "cost is:" + price);
    }
}
