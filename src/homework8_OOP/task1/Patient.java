package homework8_OOP.task1;

public class Patient {

    public void appointment(TreatmentPlan treatmentPlan, Surgeon surgeon, Dentist dentist, Therapist therapist) {
        if (treatmentPlan.code == 1) {
            surgeon.therapy();
        } else if (treatmentPlan.code == 2) {
            dentist.therapy();
        } else if (treatmentPlan.code != 1 & treatmentPlan.code != 2) {
            therapist.therapy();
        }
    }

}
