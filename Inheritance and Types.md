```java
// class Hospital{
//     void Hospitalinfo(){
//         System.out.println("Hospital Information");
//     }
// }
// class Doctor extends Hospital {
//     // Doctor() {
//     //     System.out.println("Doctor constructor called");
//     // }
//     int salary = 50000; 

//     // void Doctorinfo(){
//     //     System.out.println("Doctor Information");
//     // }
// }

// class Nurse extends Hospital{
//     // Nurse() {
//     //     System.out.println("Nurse constructor called");
//     // }
//     void Nurseinfo(){
//         System.out.println("Nurse Information");
//     }
// }

// public class InheritanceNew {
//     public static void main(String[] args){
//         Doctor dr = new Doctor();
//         dr.Hospitalinfo();
//         System.out.println("Doctor Salary: " + dr.salary);  
//         // dr.Doctorinfo();    
//         Nurse n = new Nurse();
//         n.Hospitalinfo();   
//         n.Nurseinfo();
//     }
// }


// =============================================================================
// 1. SINGLE INHERITANCE - One class extends another class
// =============================================================================

class Hospital {
    void hospitalInfo() {
        System.out.println("Hospital Information");
    }
    
    // void commonFacilities() {
    //     System.out.println("24/7 Emergency Services");
    // }
}

class Doctor extends Hospital {
    void doctorInfo() {
        System.out.println("Doctor Information");
    }
    
    void prescribe() {
        System.out.println("Doctor prescribing medicine");
    }
}

// =============================================================================
// 2. MULTILEVEL INHERITANCE - Chain of inheritance A -> B -> C
// =============================================================================

class MedicalStaff extends Hospital {
    void workShift() {
        System.out.println("Working 8-hour shift");
    }
}

class Surgeon extends MedicalStaff {
    
    void performSurgery() {
        System.out.println("Performing surgery");
    }
}

// =============================================================================
// 3. HIERARCHICAL INHERITANCE - Multiple classes inherit from same parent
// =============================================================================

class Nurse extends Hospital {
    void patientCare() {
        System.out.println("Providing patient care");
    }
}

class Pharmacist extends Hospital {
    void pharmacistInfo() {
        System.out.println("Pharmacist Information");
    }
    
}

// =============================================================================
// 4. MULTIPLE INHERITANCE (through INTERFACES only)
// =============================================================================

interface Diagnosable {
    void diagnose();

}

interface Treatable {
    void treat();
 
}

class ConsultantDoctor extends Doctor implements Diagnosable, Treatable {
    @Override
    public void diagnose() {
        System.out.println("Consultant diagnosing patient");
    }
    
    @Override
    public void treat() {
        System.out.println("Consultant treating patient");
    }
    
}

// =============================================================================
// 5. HYBRID INHERITANCE (Combination of multiple inheritance types)
// =============================================================================

interface EmergencyResponder {
    void respondToEmergency();
}

class EmergencyDoctor extends Doctor implements EmergencyResponder {
    @Override
    public void respondToEmergency() {
        System.out.println("Responding to emergency");
    }
    
}

// =============================================================================
// SIMPLE MAIN CLASS
// =============================================================================

public class InheritanceNew {
    public static void main(String[] args) {
        System.out.println(" SINGLE INHERITANCE ");
        Doctor dr = new Doctor();
        dr.hospitalInfo();    
        dr.doctorInfo();      
        
        System.out.println("\n MULTILEVEL INHERITANCE ");
        Surgeon surge = new Surgeon();
        surge.hospitalInfo();  
        surge.performSurgery(); 
        
        System.out.println("\n HIERARCHICAL INHERITANCE  ");
        Nurse n = new Nurse();
        n.hospitalInfo();     
        n.patientCare();     
        
        Pharmacist pharm = new Pharmacist();
        pharm.hospitalInfo();   
        pharm.pharmacistInfo();  
        
        System.out.println("\n  MULTIPLE INHERITANCE (Interfaces)  ");
        ConsultantDoctor consult = new ConsultantDoctor();
        consult.doctorInfo();   
        consult.diagnose();     
        
        System.out.println("\n HYBRID INHERITANCE  ");
        EmergencyDoctor emerge = new EmergencyDoctor();
        emerge.prescribe();         
        emerge.respondToEmergency();  
    }
}
```
OUTPUT:

SINGLE INHERITANCE 

Hospital Information

Doctor Information

MULTILEVEL INHERITANCE 

Hospital Information

Performing surgery

HIERARCHICAL INHERITANCE  

Hospital Information

Providing patient care

Hospital Information

Pharmacist Information

MULTIPLE INHERITANCE (Interfaces)  

Doctor Information

Consultant diagnosing patient

HYBRID INHERITANCE 

Doctor prescribing medicine

Responding to emergency
