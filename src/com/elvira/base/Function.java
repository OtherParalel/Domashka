package com.elvira.base;

public class Function {
    //Get the line name of the day of week by the number of the day.
    public static String getDayOfWeek(int a)
    {
        String response;
        switch (a)
        {
            case 1:
                response = "Monday";
                break;
                case 2:
                    response = "Tuesday";
                    break;
            case 3:
                response = "Wendnesday";
                break;
            case 4:
                response = "Thursday";
                break;
            case 5:
                response = "Friday";
                break;
            case 6:
                response = "Saturday";
                break;
            case 7:
                response = "Sunday";
                break;
            default: throw new IndexOutOfBoundsException();
        }
        return response;
    }
    //Enter the number (0-999), we get a line with the words of the number/
    public static String convertNumberToStr (int a)
    {
        return "twenty";
    }
    //Enter a string that contains a written number (0-999). Get the number itself
    public static int convertStrToNumber (String a)
    {
        return 20;
    }
    //Find the distance between two points in 2D Cartesian space.
    public static float calculateDistance(int x1, int y1, int x2, int y2)
    {
        return (float) Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }
    //Fox task 2, expand the range to 999 billion
    //Fox task 3, expand the range to 999 billion
}
