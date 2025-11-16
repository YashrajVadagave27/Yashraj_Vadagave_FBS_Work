import java.util.*;

abstract class InsurancePolicy {
    String policyHolderName;
    double basePremium;
    
    InsurancePolicy() {
        this.policyHolderName = "Tejas";
        this.basePremium = 100000.0;
    }
    
    InsurancePolicy(String name, double basePremium) {
        this.policyHolderName = name;
        this.basePremium = basePremium;
    }
    
    String getPolicyHolderName() {
		return this.policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	double getBasePremium() {
		return this.basePremium;
	}

	void setBasePremium(double basePremium) {
		this.basePremium = basePremium;
	}

	abstract double calculatePremium();

    void printPolicyDetails() {
        System.out.println("----- Policy Details -----");
        System.out.println("Policy Holder: " + this.policyHolderName);
        System.out.println("Base Premium: " + this.basePremium);
        System.out.println("Final Premium: " + calculatePremium());
        System.out.println("---------------------------");
    }
}//insurancepolicy ends here

class CarInsurance extends InsurancePolicy {
    int carAgeInYears;
    boolean hadAccident;
    double carValue;
    
    CarInsurance() {
        super();
        this.carAgeInYears = 1;
        this.hadAccident = true;
        this.carValue = 700000.0;
    }
    
    CarInsurance(String name, double basePremium, int age, boolean hadAccident, double carValue) {
        super(name, basePremium);
        this.carAgeInYears = age;
        this.hadAccident = hadAccident;
        this.carValue = carValue;
    }
    
    int getCarAgeInYears() {
		return this.carAgeInYears;
	}

	void setCarAgeInYears(int carAgeInYears) {
		this.carAgeInYears = carAgeInYears;
	}

	boolean isHadAccident() {
		return this.hadAccident;
	}

	void setHadAccident(boolean hadAccident) {
		this.hadAccident = hadAccident;
	}

	double getCarValue() {
		return this.carValue;
	}

	void setCarValue(double carValue) {
		this.carValue = carValue;
	}

	double calculatePremium() {
        double premium = basePremium;

        if (carAgeInYears <= 3)
            premium += basePremium * 0.10;
        else if (carAgeInYears <= 7)
            premium += basePremium * 0.20;
        else
            premium += basePremium * 0.30;

        if (hadAccident)
            premium += basePremium * 0.25;
        else
            premium -= basePremium * 0.10;

        if (carValue > 1000000)
            premium += 2000;

        return premium;
    }
}//carinsurance ends here

class HealthInsurance extends InsurancePolicy {
    int age;
    boolean isSmoker;
    boolean hasDisease;
    
    HealthInsurance() {
        super();
        this.age = 14;
        this.isSmoker = false;
        this.hasDisease = false;
    }
    
    HealthInsurance(String name, double basePremium, int age, boolean smoker, boolean disease) {
        super(name, basePremium);
        this.age = age;
        this.isSmoker = smoker;
        this.hasDisease = disease;
    }
    
    int getAge() {
		return this.age;
	}

	void setAge(int age) {
		this.age = age;
	}

	boolean isSmoker() {
		return this.isSmoker;
	}

	void setSmoker(boolean isSmoker) {
		this.isSmoker = isSmoker;
	}

	boolean isHasDisease() {
		return this.hasDisease;
	}

	void setHasDisease(boolean hasDisease) {
		this.hasDisease = hasDisease;
	}

	double calculatePremium() {
        double premium = basePremium;

        if (age < 30)
            premium += basePremium * 0.10;
        else if (age <= 45)
            premium += basePremium * 0.25;
        else
            premium += basePremium * 0.40;

        if (isSmoker)
            premium += basePremium * 0.30;
        else
            premium -= basePremium * 0.05;

        if (hasDisease)
            premium += basePremium * 0.20;

        return premium;
    }
}//healthinsurance ends here

public class InsuranceMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Policy Type:\n1. Car Insurance\n2. Health Insurance");
        int ch = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Base Premium: ");
        double base = sc.nextDouble();

        InsurancePolicy policy;

        if (ch == 1) {
            System.out.print("Car Age: ");
            int age = sc.nextInt();

            System.out.print("Had Accident Last Year? (true/false): ");
            boolean accident = sc.nextBoolean();

            System.out.print("Car Value: ");
            double value = sc.nextDouble();

            policy = new CarInsurance(name, base, age, accident, value);
        } else {
            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Smoker? (true/false): ");
            boolean smoker = sc.nextBoolean();

            System.out.print("Pre-existing Disease? (true/false): ");
            boolean disease = sc.nextBoolean();

            policy = new HealthInsurance(name, base, age, smoker, disease);
        }

        policy.printPolicyDetails();
    }
}