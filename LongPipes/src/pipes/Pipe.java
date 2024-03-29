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
    public static final double[] costByGrade = new double[]{0.4, 0.6, 0.75, 0.8, 0.95};     //cost of pipe by grade so grade 1 =0.4 and so on

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

    /**
     *
     * @return returns the price of the pipe taking quantity in account
     */
    public double getPrice() {
        double finalCost = 0;
        double baseCost;        //cost of the pipe without additional layers

        baseCost = this.getVolume() * costByGrade[pipeGrade - 1];       //volume * grade of the plastic
        finalCost += baseCost;

        if (pipeColourCount == 1) {     //If you have 1 colour
            finalCost += (baseCost * 0.12);
        }
        if (pipeColourCount == 2) {     //If you have two colours
            finalCost += (baseCost * 0.16);
        }
        if (innerInsulation) {      //If the inner insulation is applied
            finalCost += (baseCost * 0.13);
        }
        if (outerReinforcement) {   //If the outer reinforcement is applied
            finalCost += (baseCost * 0.17);
        }
        if (chemicalResistance) {   //If the chemicalResistance is applied
            finalCost += (baseCost * 0.14);
        }
        finalCost *= pipeQuantity;
        finalCost = (double) Math.round(finalCost * 100) / 100;     //rounding numbers to 2 d.p)
        return finalCost;

    }

    /**
     *
     * @return returns outervolume-innervolume
     */
    private double getVolume() {
        double outerVolume;
        double innerVolume;

        //2 *pi* r^2 * h
        outerVolume = Math.PI * Math.pow(pipeDiameter / 2, 2) * 39.37 * pipeLength;   //volume of the full cylinder in 
        innerVolume = Math.PI * Math.pow(pipeDiameter / 2 * 0.9, 2) * 39.37 * pipeLength;   //volume of the inner cylinder, 90% of the radius
        return outerVolume - innerVolume;
    }
}
