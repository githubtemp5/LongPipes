package pipes;

/**
 *
 * @author up826133
 */
public abstract class Pipe {

    protected double pipeLength;
    protected double pipeDiameter;
    protected int pipeGrade;
    protected boolean innerInsulation;
    protected boolean outerReinforcement;   //Outer Metallic Reinforcement
    protected boolean chemicalResistance;   //Chemical Resistance
    protected int pipeColourCount;
    protected int pipeQuantity;
    public static double[] costByGrade = new double[]{0.4, 0.6, 0.75, 0.8, 0.95};

    /**
     * Constructor of Class Pipe
     *
     * @param _pipeLength User input length of the pipe
     * @param _pipeDiameter User input diametre for the pipe
     * @param _pipeGrade User input grade
     * @param _pipeColourCount No of colours in the pipe
     * @param _innerInsulation whether the pipe has inner insulation or not
     * @param _outerReinforcement whether the pipe has the outer metallic
     * reinforcement
     * @param _chemicalResistance whether the pipe has improved chemical
     * resistance
     * @param _pipeQuantity quantity of the pipe of the same type
     */
    public Pipe(double _pipeLength, double _pipeDiameter, int _pipeGrade, int _pipeColourCount, boolean _innerInsulation, boolean _outerReinforcement, boolean _chemicalResistance, int _pipeQuantity) {

        pipeLength = _pipeLength;
        pipeDiameter = _pipeDiameter;
        pipeGrade = _pipeGrade;
        pipeColourCount = _pipeColourCount;
        innerInsulation = _innerInsulation;
        outerReinforcement = _outerReinforcement;
        chemicalResistance = _chemicalResistance;
        pipeQuantity = _pipeQuantity;
    }

    public double getPrice() {
        double finalCost = 0;
        double baseCost;
        //costByGrade[grade - 1] * inches;
        //2 *pi* r(h+r)
        baseCost = Math.PI * Math.pow(pipeDiameter / 2, 2) * pipeLength * Pipe.costByGrade[pipeGrade - 1];  //base cost
        finalCost += baseCost;

        if (pipeColourCount == 1) {     //If you have 1 colour
            finalCost += (baseCost *0.12);
        }
        if (pipeColourCount == 2) {     //If you have two colours
            finalCost += (baseCost * 0.16);
        }
        if (innerInsulation == true) {      //If the inner insulation is applied
            finalCost += (baseCost * 0.13);
        }
        if (outerReinforcement == true) {   //If the outer reinforcement is applied
            finalCost += (baseCost * 0.17);
        }
        if (chemicalResistance == true) {   //If the chemicalResistance is applied
            finalCost += (baseCost * 0.14);
        }
        finalCost = (double) Math.round(finalCost * 100) / 100;     //rounding numbers to 2 d.p)
        return finalCost;

    }

}
