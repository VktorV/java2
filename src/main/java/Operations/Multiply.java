package Operations;

public class Multiply extends Operations.Model {

    @Override
    public Double result() {
        return x * y;
    }

    @Override
    public void setX(Double value) {
        super.x = value;
    }

    @Override
    public void setY(Double value) {
        super.y = value;
    }
}
