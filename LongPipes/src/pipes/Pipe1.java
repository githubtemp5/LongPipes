package pipes;

/**
 *
 * @author up826133
 */
public class Pipe1 extends Pipe {

    /**
     *
     * @param _length input of pipe length
     * @param _diameter input of pipe diameter
     * @param _grade inputted pipe grade
     * @param _chemicalRes inputted chemical resistance (true or false) (present
     * or not)
     * @param _quantity inputted quantity of the pipe
     */
    public Pipe1(double _length, double _diameter, int _grade, boolean _chemicalRes, int _quantity) {
        super(_length, _diameter, _grade, 0, false, false, _chemicalRes, _quantity);
    }
}
