package nima.design_patterns.adapter_simple;

public class School {
    public static void main(String[] args) {
        Pen pen =  new PenAdapter();
        Assignment assign = new Assignment();
        assign.setPen(pen);
        assign.writeAssignment("Writing assignment...");
    }
}
