package homework8.task1;

public class MainApp {
    public static void main(String[] args) {
        //создание пациентов
        Patient patient1 = new Patient();
        Patient patient2 = new Patient();
        Patient patient3 = new Patient();

        //создание планов лечения с разными кодами
        TreatmentPlan treatmentPlan1 = new TreatmentPlan(1);
        TreatmentPlan treatmentPlan2 = new TreatmentPlan(2);
        TreatmentPlan treatmentPlan3 = new TreatmentPlan(3);

        //вызов методов для назначения врача по коду плана лечения
        patient1.appointment(treatmentPlan1, new Surgeon(), new Dentist(), new Therapist());
        patient2.appointment(treatmentPlan2, new Surgeon(), new Dentist(), new Therapist());
        patient3.appointment(treatmentPlan3, new Surgeon(), new Dentist(), new Therapist());

    }
}
