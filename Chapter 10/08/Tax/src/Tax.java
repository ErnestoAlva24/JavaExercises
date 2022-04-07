public class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private int[][] brackets;
    double[] rates;
    double taxableIncome;

    public Tax() {
        filingStatus = SINGLE_FILER;
        taxableIncome = 0;

        double[] rates = {10, 15, 25, 28, 33, 35};
        setRates(rates);

        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };

        setBrackets(brackets);
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax = 0, incomeTaxed = 0;
        double income = taxableIncome;

        if (rates.length >= 2)
            for (int i = rates.length - 2; i >= 0; i--)
                if (income > brackets[filingStatus][i]) {
                    tax += (incomeTaxed = income - brackets[filingStatus][i]) * rates[i + 1];
                    income -= incomeTaxed;
                }

        return tax += brackets[filingStatus][0] * rates[0];
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
}
