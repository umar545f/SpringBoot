package DesignPattern.AdapterDesignPatttern;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine)
    {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKgs() {
        double weightInPounds = weightMachine.getWeightInPounds();

        return weightInPounds * 0.45;
    }
}
