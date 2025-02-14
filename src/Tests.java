public class Tests {
    private double average;
    private int count;
    private int score;

    public Tests() {
    }

    public void getAverage(){
        average = (double) score / (double) count;
        average = average * 100;
        average = Math.round(average);
        average = average / 100;
    }

    public void addScore(int s){
        score = score + s;
        count++;
    }

    public int getCount(){
        return count;
    }

    public String toString(){
        return "The Average of the " + count + " Score entered is " + average;

    }
}