class test {
    public static void quiz(int w) {
        if(w > 1) {
            quiz(w/2);
            quiz(w/2);
        }
        System.err.print("*"+" ");
    }
    public static void main(String[] args) {
        quiz(5);
    }
}