// Fig. 10.6: HourlyEmployee.java
// HourlyEmployee class extends Employee

package pkg10_06;

public class HourlyEmployee extends Employee{
        
        private double wage; // wage per hour
        private double hours; // hours worked for week
        
        // constructor
        public HourlyEmployee(String firstName, String lastName, 
                String socialSecurityNumber, double wage, double hours)
        {
            super(firstName, lastName, socialSecurityNumber);
            
            if (wage < 0.0) // validate wage
                throw new IllegalArgumentException
                        ("Hourly wage must be >= 0.0");
            
            if ((hours < 0.0) || (hours > 168.0)) // validate hours
                throw new IllegalArgumentException
                        ("Hours worked must be >= 0.0 and <= 168.0");
            
            this.wage = wage;
            this.hours = hours;
        } // end constructor
        
        // set wage
        public void setWage(double wage)
        {
            if (wage < 0.0) // validate wage
                throw new IllegalArgumentException
                        ("Hourly wage must be >= 0.0");
            
            this.wage = wage;
        } // end method setWage
        
        // return wage
        public double getWage()
        {
            return wage;
        } // end method getWage
        
        // set hours worked
        public void setHours(double hours)
        {
            if ((hours < 0.0) || (hours > 168.0)) // validate hours
                throw new IllegalArgumentException
                        ("Hours must be >= 0.0 and <= 168.0");
            
            this.hours = hours;
        } // end method setHours
        
        // return hours worked
        public double getHours()
        {
            return hours;
        } // end method getHours
        
        // calculate earnings: override abstract method earnings in Employee
        @Override
        public double earnings()
        {
            if (getHours() <= 40) // no overtime
                return getWage() * getHours();
            else
                return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        } // end method earnings
        
        // return String representation of HourlyEmployee object
        @Override
        public String toString()
        {
            return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                    super.toString(), "hourly wage", getWage(),
                    "hours worked", getHours());
        } // end method toString
} // end class HourlyEmployee
