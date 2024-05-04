package Model;

public class Rider {
    String Name;
    String Country;
    double Weight;
    double Height;

    public Rider(String name, String country, double weight, Double height) {
        this.Name = name;
        this.Country = country;

        this.Weight = weight;
        this.Height = height;
    }
    public class Records {
        int No_Of_Olympic_Medals;
        double TopSpeed;
        int No_National_level_Records;

        public Records(int no_National_level_Records, double topSpeed, int no_Of_Olympic_Medals) {
            this.No_National_level_Records = no_National_level_Records;
            this.TopSpeed = topSpeed;
            this.No_Of_Olympic_Medals = no_Of_Olympic_Medals;
        }

        public String displayRecords() {
            return "Olympic Medals: " + No_Of_Olympic_Medals + ", Top Speed: " + TopSpeed + ", National Level Records: " + No_National_level_Records;
        }
    }

    public double calBMI(double weightm , double heightm) {
        class BMI {
            double WeightMetric;
            double HeightMetric;

            BMI(double WeightMetric, double HeightMetric) {
                this.WeightMetric = WeightMetric;
                this.HeightMetric = HeightMetric;
            }

            double bmiMetric() {
                double bmi = WeightMetric / (HeightMetric * HeightMetric);
                return bmi;
            }
        }
        BMI bmi = new BMI(weightm,heightm);
        return bmi.bmiMetric();
    }

}
