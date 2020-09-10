package Test;

import com.optum.trainingplan.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Tests {

    int[] arr = {4,5,3,8,9};
    ArraySum as = new ArraySum(12, arr);

    @Test
    void ArraySum(){
        ArrayList<String> ls = new ArrayList<>();
        ls.add(0, "0, 3");
        ls.add(1,"2, 4");
        assertTrue(as.findPair().toString().equals(ls.toString()));
    }

    @Test
    void SecondLargest(){
        int[] arr = {4,5,3,8,9};
        SecondLargest sl = new SecondLargest(arr);
        assertTrue(sl.FindSecLargest().equals("8"));
    }

    @Test
    void TempConvert(){
        TempConvert tc = new TempConvert(212f);
        assertTrue(tc.ConverttoCel()==100f);
    }

    @Test
    void AddDigits(){
        AddDigits ad = new AddDigits(548);
        assertTrue(ad.FindsumofDigits()==17);
    }

    @Test
    void Multiplication(){
        assertEquals(Multiplication.Mult(), 0.839f, 0.001);
    }

    @Test
    void MinToYears(){
        MinToYears my = new MinToYears(530000);
        assertEquals(my.Convert(), "1, 3");
    }

    @Test
    void RectArea(){
        RectArea ra = new RectArea(7.9f,4.5f);
        assertTrue(ra.AreaCalc()==35.55f);
    }

    @Test
    void FeetToMeter(){
        FeetToMeter fm = new FeetToMeter(14);
        assertEquals(fm.Convert(), 4.27, 0.01);
    }

    @Test
    void Swap(){
        Swap s = new Swap(10, 20);
        assertEquals(s.BeforeSwap(), "10, 20");
        assertEquals(s.AfterSwap(), "20, 10");
    }

    @Test
    void EvenOrOdd(){
        EvenOrOdd eo1 = new EvenOrOdd(45);
        EvenOrOdd eo2 = new EvenOrOdd(54);
        assertEquals(eo1.Determine(), "O");
        assertEquals(eo2.Determine(), "E");
    }

    @Test
    void Fibonacci(){
        Fibonacci f = new Fibonacci(6);
        int[] arr = {1,1,2,3,5,8};
        assertArrayEquals(f.Fseries(), arr);
    }

    @Test
    void ABCLoop(){
        char[] arr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S','T','U','V','W','X','Y','Z'};
        assertArrayEquals(ABCLoop.Print(), arr);
    }

    @Test
    void CharToInt(){
        CharToInt ci = new CharToInt('P');
        assertEquals(ci.Convert(), 80);
    }

    @Test
    void AddNNumbers(){
        int[] arr = {4,5,3,8,9};
        AddNNumbers an = new AddNNumbers(arr);
        assertEquals(an.AddArray(), 29);
    }

    @Test
    void EMICalc(){
        EMICalc ec = new EMICalc(1000,10,12);
        assertEquals(ec.Calculate(), 1055, 0.1);
    }
    
}