package oop.runners;

public enum Runner {
    BEGINNER(300, 420),
    INTERMEDIATE(180, 300),
    ADVANCED(120, 180);

    private final int minRunTimeInMinutes;
    private final int maxRunTimeInMinutes;

    Runner(int minRunTimeInMinutes, int maxRunTimeInMinute) {
        this.minRunTimeInMinutes = minRunTimeInMinutes;
        this.maxRunTimeInMinutes = maxRunTimeInMinute;
    }

    static void getFitnessLevel(int timeMarathonWasRun) {

        if (timeMarathonWasRun > ADVANCED.minRunTimeInMinutes && timeMarathonWasRun < ADVANCED.maxRunTimeInMinutes) {
            System.out.println(Runner.ADVANCED);
        } else if (timeMarathonWasRun > INTERMEDIATE.minRunTimeInMinutes && timeMarathonWasRun < INTERMEDIATE.maxRunTimeInMinutes) {
            System.out.println(Runner.INTERMEDIATE);
        } else if (timeMarathonWasRun > BEGINNER.minRunTimeInMinutes && timeMarathonWasRun < BEGINNER.maxRunTimeInMinutes) {
            System.out.println(Runner.BEGINNER);
        } else {
            System.out.println("You did not qualify for a ranking.");
        }


    }
}
