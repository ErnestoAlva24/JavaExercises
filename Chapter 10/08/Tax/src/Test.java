public class Test {
    public static void main(String[] args) {
        Tax tax1 = new Tax();
        Tax tax2 = new Tax();

        double[] rates2001 = {15, 27.5, 30.5, 35.5, 39.1};
        tax1.setRates(rates2001);


        int[][] brackets2001 = {
                {27050, 65550, 136750, 297350},
                {45200, 109250, 166500, 297350},
                {22600, 54625, 83250, 148675},
                {36250, 93650, 151650, 297350}
        };

        tax1.setBrackets(brackets2001);


        final double FROM = 50000;
        final double TO = 60000;
        final double INTERVAL = 1000;

        System.out.println("\n2001 tax tables for taxable income from $50,000 to $60,000");

        System.out.println("---------------------------------------------------------------------\n" +
                "Taxable       Single      Married Joint       Married        Head of\n" +
                "Income                    or Qualifying       Separate       a House\n" +
                "                          Widow(er)\n" +
                "---------------------------------------------------------------------");

        for (double taxableIncome = FROM;taxableIncome <= TO; taxableIncome += INTERVAL) {
            tax1.setTaxableIncome(taxableIncome);
            System.out.printf("%-13.0f", taxableIncome);
            tax1.setFilingStatus(Tax.SINGLE_FILER);
            System.out.printf("%8.2f", tax1.getTax());
            tax1.setFilingStatus(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW);
            System.out.printf("%15.2f", tax1.getTax());
            tax1.setFilingStatus(Tax.MARRIED_SEPARATELY);
            System.out.printf("%18.2f", tax1.getTax());
            tax1.setFilingStatus(Tax.HEAD_OF_HOUSEHOLD);
            System.out.printf("%15.2f\n", tax1.getTax());
        }

        System.out.println( "\n2009 tax tables for taxable income from $50,000 to $60,000");

        System.out.println("---------------------------------------------------------------------\n" +
                "Taxable       Single      Married Joint       Married        Head of\n" +
                "Income                    or Qualifying       Separate       a House\n" +
                "                          Widow(er)\n" +
                "---------------------------------------------------------------------");

        for (double taxableIncome = FROM;taxableIncome <= TO; taxableIncome += INTERVAL) {
            tax2.setTaxableIncome(taxableIncome);
            System.out.printf("%-13.0f", taxableIncome);
            tax2.setFilingStatus(Tax.SINGLE_FILER);
            System.out.printf("%8.2f", tax2.getTax());
            tax2.setFilingStatus(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW);
            System.out.printf("%15.2f", tax2.getTax());
            tax2.setFilingStatus(Tax.MARRIED_SEPARATELY);
            System.out.printf("%18.2f", tax2.getTax());
            tax2.setFilingStatus(Tax.HEAD_OF_HOUSEHOLD);
            System.out.printf("%15.2f\n", tax2.getTax());
        }
    }
}
