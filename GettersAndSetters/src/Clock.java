public class Clock {

    private byte hours = 0;
    private byte minutes = 0;

    public byte getHours() {
        if (hours > 23 || hours < 0) {
            System.out.println("Сначала измените значение переменной!");
        }
        return hours;
    }

    public void setHours(byte hours) {
        if (hours > 23 || hours < 0) {
            System.out.println("Вы ввели неверное значение!");
        } else
        this.hours = hours;
    }

    public byte getMinutes() {
        if (minutes > 60 || minutes < 0){
            System.out.println("Сначала измените значение переменной!");
        }
        return minutes;
    }

    public void setMinutes(byte minutes) {
        if (minutes > 60 || hours < 0) {
            System.out.println("Вы ввели неверное значение!");
        } else
        this.minutes = minutes;
    }

}
