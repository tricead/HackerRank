class Calculate {
    Scanner sc = new Scanner(System.in);
    Output output = new Output();
    
    public double getDoubleVal() throws IOException {
        double doubleVal = sc.nextDouble();
        if (doubleVal <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return doubleVal;
    }
    public int getINTVal() {
        int intVal = sc.nextInt();
        if (intVal <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return intVal;
    }
    public static Volume get_Vol(){
        return new Volume();
    }
}

class Volume {
    public double main(int a) {
        return a * a * a;
    }
    
    public double main(int l, int b, int h){
        return l * b * h;
    }
    
    public double main(double r){
        return (2 * Math.PI * r * r * r)/3;
    }
    
    public double main(double r, double h) {
        return (Math.PI * r * r * h);
    }
}

class Output {
    void display(double num){
        System.out.println(String.format("%.3f", num));
    }
}
