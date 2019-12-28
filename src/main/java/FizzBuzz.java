public class FizzBuzz {
    public String of(int number){
        if(number<=0){
            throw new IllegalArgumentException("Invalid input");
        }
        String rs="";
        if(number%3 == 0){
            rs+="Fizz";
        }
        if(number%5 == 0){
            rs+="Buzz";
        }
        if(number%7 == 0){
            rs+="Whizz";
        }
        if(rs.length()==0){
            return String.format("%d", number);
        }
        return String.format("%s", rs);
    }
}
