package ie.atu.week2;

public class calculator {

    private Double total;

    private String operation;

    private String error;

    public calculator(String operation, Double total, String error) {
        this.operation = operation;
        this.total = total;
        this.error = error;
    }

    public String getOperation() {
        return operation;
    }

    public Double getTotal() {
        return total;
    }

    public String getError() {
        return error;
    }



}
