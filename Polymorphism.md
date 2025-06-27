```java
// class Hospital {
//     public void treat(){
//         System.out.println("Do Treatment");
//     }
// }
// class Doctor extends Hospital {
//     public void treat() {
//         System.out.println("Doctor treats patients");
//     }
// }

// class Nurse extends Hospital {
//     public void treat() {
//         System.out.println("Nurse also treats patients");
//     }
// }

// public class PolymorphismEx {
//     public static void main(String[] args) {
//         // Hospital doc = new Doctor();
//         // Hospital nurse = new Nurse();
//         // doc.treat();
//         // nurse.treat();

//         Hospital h;
//         h = new Doctor(); 
//         h.treat(); 
//         h = new Nurse();
//         h.treat(); 
//     }
// }
      


class Hospital {
  
    public void treat() {
        System.out.println("Hospital: General treatment provided");
    }
    
    public void treat(String patientName) {
        System.out.println("Hospital: Treating patient " + patientName);
    }
    
    public void treat(String patientName, String condition) {
        System.out.println("Hospital: Treating " + patientName + " for " + condition);
    }
    
    public void treat(int patientId) {
        System.out.println("Hospital: Treating patient with ID: " + patientId);
    }
    
    public void treat(String patientName, int age, String condition) {
        System.out.println("Hospital: Treating " + patientName + " (age " + age + ") for " + condition);
    }
   
    public void emergencyService() {
        System.out.println("Hospital: Providing emergency service");
    }
}

class Doctor extends Hospital {
    private String specialization;
    
    public Doctor() {
        this.specialization = "General Medicine";
    }
    
    public Doctor(String specialization) {
        this.specialization = specialization;
    }
    
    @Override
    public void treat() {
        System.out.println("Doctor (" + specialization + "): Examining and treating patients with medicine");
    }
  
    @Override
    public void treat(String patientName) {
        System.out.println("Doctor (" + specialization + "): Examining " + patientName + " and prescribing medication");
    }
    
    @Override 
    public void treat(String patientName, String condition) {
        System.out.println("Doctor (" + specialization + "): Treating " + patientName + "'s " + condition + " with specialized care");
    }
   
    public void treat(String patientName, String condition, String medication) {
        System.out.println("Doctor (" + specialization + "): Prescribing " + medication + " to " + patientName + " for " + condition);
    }
    
    public void prescribe(String medication) {
        System.out.println("Doctor: Prescribing " + medication);
    }
    
    public void prescribe(String medication, String dosage) {
        System.out.println("Doctor: Prescribing " + medication + " - Dosage: " + dosage);
    }
    
    public void prescribe(String medication, String dosage, int days) {
        System.out.println("Doctor: Prescribing " + medication + " - Dosage: " + dosage + " for " + days + " days");
    }
}

class Surgeon extends Doctor {
    private String surgeryType;
    
    public Surgeon() {
        super("Surgery");
        this.surgeryType = "General Surgery";
    }
    
    public Surgeon(String surgeryType) {
        super("Surgery");
        this.surgeryType = surgeryType;
    }
   
    @Override
    public void treat() {
        System.out.println("Surgeon (" + surgeryType + "): Performing surgical procedures");
    }
    
    @Override
    public void treat(String patientName) {
        System.out.println("Surgeon: Preparing " + patientName + " for " + surgeryType);
    }
   
    public void treat(String patientName, String procedure, int duration) {
        System.out.println("Surgeon: Performing " + procedure + " on " + patientName + " - Duration: " + duration + " hours");
    }
    
    public void performSurgery() {
        System.out.println("Surgeon: Performing " + surgeryType);
    }
    
    public void performSurgery(String patientName) {
        System.out.println("Surgeon: Performing " + surgeryType + " on " + patientName);
    }
    
    public void performSurgery(String patientName, String procedure) {
        System.out.println("Surgeon: Performing " + procedure + " on " + patientName);
    }
    
    public void performSurgery(String patientName, String procedure, int teamSize) {
        System.out.println("Surgeon: Leading team of " + teamSize + " for " + procedure + " on " + patientName);
    }
}

public class PolymorphismEx {
    public static void main(String[] args) {
        Hospital h1 = new Hospital();
        Hospital h2 = new Doctor();
        Hospital h4 = new Surgeon();
        
       
        h1.treat(); 
        h2.treat(); 
        h4.treat(); 
        
        Hospital hospital = new Hospital();
        System.out.println("Hospital overloaded methods:");
        hospital.treat();                         
        hospital.treat("Viji");               
        hospital.treat("Viji", "Fever");       
    
        
        System.out.println("\nDoctor overloaded methods:");
        Doctor doctor = new Doctor("Pediatrics");
        doctor.treat();                                   
        doctor.treat("Vijiishwarya");                      

        System.out.println("\nDoctor prescribe methods (overloading):");
        doctor.prescribe("Dolo");                    
        doctor.prescribe("Allerbest", "200mg");        
        
        System.out.println("\nSurgeon overloaded methods:");
        Surgeon surgeon = new Surgeon("Neurosurgery");
        surgeon.treat("Vinu");               
        surgeon.treat("Arthi", "hand Surgery", 6); 
        
        System.out.println("\nSurgeon performSurgery methods (overloading):");
        surgeon.performSurgery("Vijiish", "Leg Surgery", 5);
        
    }  
}


```
