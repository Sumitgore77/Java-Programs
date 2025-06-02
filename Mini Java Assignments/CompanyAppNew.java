import java.util.*;

class Employee
  {
	
	private int id,salary;
	private String name,email,addr;
	private long contact;

	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}

	public String getEmail()
	{
		return email;
	}	
	
	public void setAddr(String addr)
	{
		this.addr=addr;
	}
	public String getAddr()
	{
		return addr;
	}
	
	public void setContact(long contact)
	{
		this.contact=contact;
	}
	public long getContact(){
		return contact;
	}

        public void setSalary(int salary)
        {
           this.salary=salary;
        }

        public int getSalary()
         {
            return salary;
         }
}

class Company
{
   Employee emp[];
     int n;
    Company(Employee ...emp)
     {
        this.emp=emp;
        n=emp.length;
     }     

   
  int count=0;
   //Show Employee Detail;
    public void showEmployeeDetail(int count)
     {


        
               
      if(count<n)
       {          
          System.out.println("\n------Employee Deatil------ ");
             
     
         System.out.println("\nID\tName\t\tEmail\t\tAddress\t\tContact\t\tSalary");

         for(int i=0;i<n-count;i++)
          {
            System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t\t"+emp[i].getEmail()+"\t\t"+emp[i].getAddr()+"\t\t"+
            emp[i].getContact()+"\t\t"+emp[i].getSalary());
          }
          System.out.println("\n-----------------------------------------------------------------------------");
        }
      else
        {
          System.out.println("No Employee Detail:");
        }
       
     }    


    //Search Employee
 
    int choice,no;
    String str;
    public void searchEmployee(int choice,int no,String str,int count)
     {int i;
       boolean flag=true;
         
       if(count<n)
        {
            System.out.println("\n------Employee Deatil------\n");

               System.out.println("\nID\tName\t\tEmail\t\tAddress\t\tContact\t\tSalary"); 

          switch(choice)
           {     
               case 1:
                 {
                   for(i=0;i<n-count;i++)
                    {
                      if(emp[i].getId()==no)
                       {
                         System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t\t"+emp[i].getEmail()+"\t\t"+emp[i].getAddr()+"\t\t"+
                         emp[i].getContact()+"\t\t"+emp[i].getSalary());
                         flag=false;
                       }
                    }

                     if(flag)
                      {
                        System.out.println("\nNot Valid");
                      }
                    else
                     {
                         flag=true;
                     }
                    break;
                 }

                case 2:
                 {
                   for(i=0;i<n-count;i++)
                    {
                      if((emp[i].getName()) .equals (str))
                       {
                         System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t\t"+emp[i].getEmail()+"\t\t"+emp[i].getAddr()+"\t\t"+
                         emp[i].getContact()+"\t\t"+emp[i].getSalary());
                         flag=false;
                       }
                    }

                     if(flag)
                      {
                        System.out.println("\nNot Valid");
                      }
                    else
                     {
                         flag=true;
                     }
                    break;
                 }

                case 3:
                 {for(i=0;i<n-count;i++)
                    {
                      if((emp[i].getEmail()) .equals (str))
                       {
                         System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t\t"+emp[i].getEmail()+"\t\t"+emp[i].getAddr()+"\t\t"+
                         emp[i].getContact()+"\t\t"+emp[i].getSalary());
                         flag=false;
                       }
                    }

                     if(flag)
                      {
                        System.out.println("\nNot Valid");
                      }
                    else
                     {
                         flag=true;
                     }
                    break;
                 }

                case 4:
                 {for(i=0;i<n-count;i++)
                    {
                      if(emp[i].getSalary()==no)
                       {
                         System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t\t"+emp[i].getEmail()+"\t\t"+emp[i].getAddr()+"\t\t"+
                         emp[i].getContact()+"\t\t"+emp[i].getSalary());
                         flag=false;
                       }
                    }

                     if(flag)
                      {
                        System.out.println("\nNot Valid");
                      }
                    else
                     {
                         flag=true;
                     }
                    break;
                 }

                case 5:
                 {for(i=0;i<n-count;i++)
                    {
                      if((emp[i].getAddr()) .equals (str))
                       {
                         System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t\t"+emp[i].getEmail()+"\t\t"+emp[i].getAddr()+"\t\t"+
                         emp[i].getContact()+"\t\t"+emp[i].getSalary());
                         flag=false;
                       }
                    }

                     if(flag)
                      {
                        System.out.println("\nNot Valid");
                      }
                    else
                     {
                         flag=true;
                     }
                    break;
                 }

               default:
                   {
                     System.out.println("\nWrong Choice:");
                     break;
                   }

            }
             System.out.println("\n-----------------------------------------------------------------------------");
          }
         else
           {
              System.out.println("\nNo Employee Detail:");
           }

     }

    //Delete Employee Details
     
     public void  DeleteEmployeeDetail(int choice,int no,String str,int count)
      {int i,j;
          
              boolean flag=true;
              
      if(count<n)
       {   System.out.println("\n------After Delete Employee Deatil------\n");

               System.out.println("\nID\tName\t\tEmail\t\tAddress\t\tContact\t\tSalary"); 

          switch(choice)
           {     
               case 1:
                 {
                   for(i=0;i<n-count;i++)
                    {
                      if(emp[i].getId()==no)
                       {
                         for(j=i;j<n-1;j++)
                          {
                            emp[j]=emp[j+1];
                            
                          }
			 flag=false;
                       }
                    }
                    
                     if(flag)
                      {
                        System.out.println("\nNot Valid");
                      }
                    else
                     {
                         
                         for(i=0;i<n-count;i++)
                          {
                             
                               System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t\t"+emp[i].getEmail()+"\t\t"+emp[i].getAddr()+"\t\t"+
                               emp[i].getContact()+"\t\t"+emp[i].getSalary());
                          }
                         flag=true;
                     }

                    break;
                  }
                
                case 2:
                 {
                   for(i=0;i<n-count;i++)
                    {
                      if((emp[i].getName()) .equals (str))
                       {
                         for(j=i;j<n-1;j++)
                          {
                            emp[j]=emp[j+1];
                            
                          }
			 flag=false;
                       }
                    }
                    
                     if(flag)
                      {
                        System.out.println("\nNot Valid");
                      }
                    else
                     {
                         
                         for(i=0;i<n-count;i++)
                          {
                             
                               System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t\t"+emp[i].getEmail()+"\t\t"+emp[i].getAddr()+"\t\t"+
                               emp[i].getContact()+"\t\t"+emp[i].getSalary());
                          }
                         flag=true;
                     }

                    break;
                  }

                case 3:
                 {
                   for(i=0;i<n-count;i++)
                    {
                      if((emp[i].getEmail()) .equals (str))
                       {
                         for(j=i;j<n-1;j++)
                          {
                            emp[j]=emp[j+1];
                            
                          }
			 flag=false;
                       }
                    }
                    
                     if(flag)
                      {
                        System.out.println("\nNot Valid");
                      }
                    else
                     {
                         
                         for(i=0;i<n-count;i++)
                          {
                             
                               System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t\t"+emp[i].getEmail()+"\t\t"+emp[i].getAddr()+"\t\t"+
                               emp[i].getContact()+"\t\t"+emp[i].getSalary());
                          }
                         flag=true;
                     }

                    break;
                  }

                case 4:
                 {
                   for(i=0;i<n-count;i++)
                    {
                      if(emp[i].getSalary()==no)
                       {
                         for(j=i;j<n-1;j++)
                          {
                            emp[j]=emp[j+1];
                            
                          }
			 flag=false;
                       }
                    }
                    
                     if(flag)
                      {
                        System.out.println("\nNot Valid");
                      }
                    else
                     {
                         
                         for(i=0;i<n-count;i++)
                          {
                             
                               System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t\t"+emp[i].getEmail()+"\t\t"+emp[i].getAddr()+"\t\t"+
                               emp[i].getContact()+"\t\t"+emp[i].getSalary());
                          }
                         flag=true;
                     }

                    break;
                  }
 
                case 5:
                 {
                   for(i=0;i<n-count;i++)
                    {
                      if((emp[i].getAddr()) .equals (str))
                       {
                         for(j=i;j<n-1;j++)
                          {
                            emp[j]=emp[j+1];
                            
                          }
			 flag=false;
                       }
                    }
                    
                     if(flag)
                      {
                        System.out.println("\nNot Valid");
                      }
                    else
                     {
                         
                         for(i=0;i<n-count;i++)
                          {
                             
                               System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t\t"+emp[i].getEmail()+"\t\t"+emp[i].getAddr()+"\t\t"+
                               emp[i].getContact()+"\t\t"+emp[i].getSalary());
                          }
                         flag=true;
                     }

                    break;
                  }

                  default:
                   {
                     System.out.println("\nWrong Choice:");
                     break;
                   }

           }//swicth Close
            System.out.println("\n-----------------------------------------------------------------------------");
         }
       else
         {
           System.out.println("\nNo Employee Detail:");
         }
        
        
      }    

    //Update Employee Details Using:

    public void updateEmployee(int choice,int no,String str,int count)
     {
        Scanner sc=new Scanner(System.in);

        boolean flag=true;
        int i;
         if(count<n)
          {
             
            switch(choice)
             {
                case 1:
                 {
                    for(i=0;i<n-count;i++)
                     {
                       if(emp[i].getId()==no)
                        {
                           System.out.println("\n------Enter New Employee Deatil------\n");
                           
                           System.out.print("ID: ");
                           int id=sc.nextInt();

                           sc.nextLine();
                           System.out.print("Name: ");
                           String name=sc.nextLine();

                           System.out.print("Email: ");
                           String email=sc.nextLine();

                           System.out.print("Address: ");
                           String Add=sc.nextLine();

                           System.out.print("Contact: ");
                           long con=sc.nextLong();

                           System.out.print("Salary: ");
                           int salary=sc.nextInt();
                          
                           emp[i].setId(id);
                           emp[i].setName(name);
                           emp[i].setEmail(email);
                           emp[i].setAddr(Add);
                           emp[i].setContact(con);
                           emp[i].setSalary(salary);
                            
                           System.out.println("\nSuccessful Update Employee Detail:");
                           flag=false;
                        }
                     }//loop close
                    
                     if(flag)
                      {
                        System.out.println("\nNot Valid");
                      } 
                    else
                      {
                         flag=true;
                      }
                    break;
                 }//case 1 close;

                case 2:
                  {
                     for(i=0;i<n-count;i++)
                     {
                       if((emp[i].getName()) .equals (str))
                        {
                           System.out.println("\n------Enter New Employee Deatil------\n");
                           
                           System.out.print("ID: ");
                           int id=sc.nextInt();

                           sc.nextLine();
                           System.out.print("Name: ");
                           String name=sc.nextLine();

                           System.out.print("Email: ");
                           String email=sc.nextLine();

                           System.out.print("Address: ");
                           String Add=sc.nextLine();

                           System.out.print("Contact: ");
                           long con=sc.nextLong();

                           System.out.print("Salary: ");
                           int salary=sc.nextInt();
                          
                           emp[i].setId(id);
                           emp[i].setName(name);
                           emp[i].setEmail(email);
                           emp[i].setAddr(Add);
                           emp[i].setContact(con);
                           emp[i].setSalary(salary);
                            
                           System.out.println("\nSuccessful Update Employee Detail:");
                           flag=false;
                        }
                     }//loop close
                    
                     if(flag)
                      {
                        System.out.println("\nNot Valid");
                      } 
                    else
                      {
                         flag=true;
                      }
                    break;

                  }//case 2 close;

                 case 3:
                  {
                    for(i=0;i<n-count;i++)
                     {
                       if((emp[i].getEmail()) .equals (str))
                        {
                           System.out.println("\n------Enter New Employee Deatil------\n");
                           
                           System.out.print("ID: ");
                           int id=sc.nextInt();

                           sc.nextLine();
                           System.out.print("Name: ");
                           String name=sc.nextLine();

                           System.out.print("Email: ");
                           String email=sc.nextLine();

                           System.out.print("Address: ");
                           String Add=sc.nextLine();

                           System.out.print("Contact: ");
                           long con=sc.nextLong();

                           System.out.print("Salary: ");
                           int salary=sc.nextInt();
                          
                           emp[i].setId(id);
                           emp[i].setName(name);
                           emp[i].setEmail(email);
                           emp[i].setAddr(Add);
                           emp[i].setContact(con);
                           emp[i].setSalary(salary);
                            
                           System.out.println("\nSuccessful Update Employee Detail:");
                           flag=false;
                        }
                     }//loop close
                    
                     if(flag)
                      {
                        System.out.println("\nNot Valid");
                      } 
                    else
                      {
                         flag=true;
                      }
                    break;
                  }//case 3 close; 

                 case 4:
                  {
                   for(i=0;i<n-count;i++)
                     {
                       if(emp[i].getSalary()==no)
                        {
                           System.out.println("\n------Enter New Employee Deatil------\n");
                           
                           System.out.print("ID: ");
                           int id=sc.nextInt();

                           sc.nextLine();
                           System.out.print("Name: ");
                           String name=sc.nextLine();

                           System.out.print("Email: ");
                           String email=sc.nextLine();

                           System.out.print("Address: ");
                           String Add=sc.nextLine();

                           System.out.print("Contact: ");
                           long con=sc.nextLong();

                           System.out.print("Salary: ");
                           int salary=sc.nextInt();
                          
                           emp[i].setId(id);
                           emp[i].setName(name);
                           emp[i].setEmail(email);
                           emp[i].setAddr(Add);
                           emp[i].setContact(con);
                           emp[i].setSalary(salary);
                            
                           System.out.println("\nSuccessful Update Employee Detail:");
                           flag=false;
                        }
                     }//loop close
                    
                     if(flag)
                      {
                        System.out.println("\nNot Valid");
                      } 
                    else
                      {
                         flag=true;
                      }
                    break;
                  }//case 4 close;

                  case 5:
                   {
                    for(i=0;i<n-count;i++)
                     {
                       if((emp[i].getAddr()) .equals (str))
                        {
                           System.out.println("\n------Enter New Employee Deatil------\n");
                           
                           System.out.print("ID: ");
                           int id=sc.nextInt();

                           sc.nextLine();
                           System.out.print("Name: ");
                           String name=sc.nextLine();

                           System.out.print("Email: ");
                           String email=sc.nextLine();

                           System.out.print("Address: ");
                           String Add=sc.nextLine();

                           System.out.print("Contact: ");
                           long con=sc.nextLong();

                           System.out.print("Salary: ");
                           int salary=sc.nextInt();
                          
                           emp[i].setId(id);
                           emp[i].setName(name);
                           emp[i].setEmail(email);
                           emp[i].setAddr(Add);
                           emp[i].setContact(con);
                           emp[i].setSalary(salary);
                            
                           System.out.println("\nSuccessful Update Employee Detail:");
                           flag=false;
                        }
                     }//loop close
                    
                     if(flag)
                      {
                        System.out.println("\nNot Valid");
                      } 
                    else
                      {
                         flag=true;
                      }
                    break;
                   }//case 5 close;
               
                  default:
                   {
                     System.out.println("\nWrong Choice:");
                     break;
                   }

             }//close switch case;
          }
        else
          {
            System.out.println("\nNo Employee Detail:");
          }
         
     }

    //Sorting Employee Details Using:

    public void SortingEmployee(int choice,int no,int count)
     {
        if(count<n)
         {int i,j;
               Employee temp[]=new  Employee[n];
               Employee ab;
               int k=0;
               for(i=0;i<n;i++)
                {
                  temp[k++]=emp[i];
                }
              
              boolean flag=true;
              
              switch(choice)
               {
                  case 1:
                    {
                     System.out.println("\n------Employee Deatil In Ascending Order.------ ");

                      System.out.println("\nID\tName\t\tEmail\t\tAddress\t\tContact\t\tSalary");

                     for(k=0;k<n-count;k++)
                      {  
                        if(temp[k].getId()==no && flag==true)
                         {flag=false;
                        for(i=0;i<n-count;i++)
                          {
                            for(j=i;j<n-count;j++)
                             {
                               if(temp[i].getId()>temp[j].getId())
                               {
                                 ab=temp[i];
                                 temp[i]=temp[j];
                                 temp[j]=ab;
                                }
                              }
                          System.out.println(temp[i].getId()+"\t"+temp[i].getName()+"\t\t"+temp[i].getEmail()+"\t\t"+temp[i].getAddr()+"\t\t"+
                               temp[i].getContact()+"\t\t"+temp[i].getSalary());
                           }
                          }
                        }
                       if(flag)
                        {
                           System.out.println("\nNot Valid");
                        }
                       else
                        {
                           flag=true;
                        }
                      break;
                     }//case 1 close;

                   case 2:
                    {
                     System.out.println("\n------Employee Deatil In Descending Order.------ ");

                     System.out.println("\nID\tName\t\tEmail\t\tAddress\t\tContact\t\tSalary");

                     for(k=0;k<n-count;k++)
                      {  
                        if(temp[k].getSalary()==no && flag==true)
                         {flag=false;
                        for(i=0;i<n-count;i++)
                          {
                            for(j=i;j<n-count;j++)
                             {
                               if(temp[i].getSalary()<temp[j].getSalary())
                               {
                                 ab=temp[i];
                                 temp[i]=temp[j];
                                 temp[j]=ab;
                                }
                              }
                          System.out.println(temp[i].getId()+"\t"+temp[i].getName()+"\t\t"+temp[i].getEmail()+"\t\t"+temp[i].getAddr()+"\t\t"+
                               temp[i].getContact()+"\t\t"+temp[i].getSalary());
                           }
                          }
                        }
                        if(flag)
                        {
                           System.out.println("\nNot Valid");
                        }
                       else
                        {
                           flag=true;
                        }

                      break;
                     }//case 2 close;
              
               }//switch close;
               System.out.println("\n-----------------------------------------------------------------------------");
         }
       else
         {
           System.out.println("\nNo Employee Detail:");
         }
     }

   //Display the employee details in highest salary.
   
    public void HighestSalary(int count)
     {
        if(count<n)
         {
            Employee max=emp[0];
            System.out.println("\n------Hightest Salary Employee Deatil------ ");

            System.out.println("\nID\tName\t\tEmail\t\tAddress\t\tContact\t\tSalary");

              for(int i=0;i<n-count;i++)
                {
                    if(emp[i].getSalary()>max.getSalary())
                      {
                          max=emp[i];
                      }
                }
                System.out.println(max.getId()+"\t"+max.getName()+"\t\t"+max.getEmail()+"\t\t"+max.getAddr()+"\t\t"+
                               max.getContact()+"\t\t"+max.getSalary());

            System.out.println("\n-----------------------------------------------------------------------------");
         }
       else
         {
            System.out.println("\nNo Employee Detail:");
         }
     }

    // Display the employee details in second highest salary.
    
    public void SecondHighestSalary(int count)
     {
        if(count<n)
         {int i,j;
             Employee temp[]=new  Employee[n];
               Employee ab;
               int k=0;
               for(i=0;i<n;i++)
                {
                  temp[k++]=emp[i];
                }
           
                     
                        for(i=0;i<n-count;i++)
                          {
                            for(j=i;j<n-count;j++)
                             {
                               if(temp[i].getSalary()<temp[j].getSalary())
                               {
                                 ab=temp[i];
                                 temp[i]=temp[j];
                                 temp[j]=ab;
                                }
                              }
                           }
                 //int c=0;
                  Employee min=temp[0];
                 boolean flag=false;
                 for(i=0;i<n-count;i++)
                    {
                        if(temp[i].getSalary()<min.getSalary())
                         {
                             min=temp[i];
                             flag=true;
                             break;
                         }
                    }
          if(flag)
           {
                  System.out.println("\n------Second Hightest Salary Employee Deatil------ ");

            System.out.println("\nID\tName\t\tEmail\t\tAddress\t\tContact\t\tSalary");

                  System.out.println(min.getId()+"\t"+min.getName()+"\t\t"+min.getEmail()+"\t\t"+min.getAddr()+"\t\t"+
                               min.getContact()+"\t\t"+min.getSalary());
             System.out.println("\n-----------------------------------------------------------------------------");
              flag=false;
            }
           else
            {
               System.out.println("\nNo Second Hightest Salary:");
              
            }
          }
        else
         {
           System.out.println("\nNo Employee Detail:");
         }
     }

    //Display the employee details in minimum salary is 10000 to maximum salary is 50000.

    public void MiniMaxSalay(int count)
     {
         if(count<n)
          {
               System.out.println("\n------Minimum salary is 10000 to Maximum salary is 50000------ ");

            System.out.println("\nID\tName\t\tEmail\t\tAddress\t\tContact\t\tSalary");
        
              for(int i=0;i<n-count;i++)
                {
                    if(emp[i].getSalary()>=10000 && emp[i].getSalary()<=50000)
                     {
                        System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t\t"+emp[i].getEmail()+"\t\t"+emp[i].getAddr()+"\t\t"+
                               emp[i].getContact()+"\t\t"+emp[i].getSalary());
                     }
                }
             System.out.println("\n-----------------------------------------------------------------------------");

          }
        else
          {
            System.out.println("\nNo Second Hightest Salary:");
          }
     }
}

public class CompanyAppNew
{
  public static void main(String x[]) 
  {
	Scanner sc=new Scanner(System.in);
      
        int c=0;
        int  count=0;
	System.out.println("Enter employee count :");
	int size=sc.nextInt();

	 Employee e[]=new Employee[size];
	int choice;
        
	do{
            int i,j;
            
             System.out.println("\npress 1:--> Add Employee Detail.");
             System.out.println("press 2:--> Show Employee Detail.");
             System.out.println("press 3:--> Search Employee.");
             System.out.println("press 4:--> Delete Employee Detail.");
             System.out.println("press 5:--> Update Employee Detail.");
             System.out.println("press 6:--> Shorting Employee Detail.");
             System.out.println("press 7:--> Highest salary.");
             System.out.println("press 8:--> Second highest salary.");
             System.out.println("press 9:--> Minimum Salary is 10000 to maximum salary is 50000.");
             System.out.println("press 0:--> Exit --->press 0:\n");

              
             System.out.print("Enter Choice: \n");
             choice=sc.nextInt();

             
             switch(choice)
              {
                   case 0:
                    {
                      System.out.println("\n------Thank You------ ");
                      break;
                    }
                   case 1://Add Employee Details.
                    {c++;
                       count=0;
                       System.out.println("Enter "+size+" Employee Detail:");
                       for(i=0;i<size;i++)
                        {
                           e[i]=new Employee();

                           System.out.println("Enter "+(i+1)+" Detail:");
                           System.out.print("ID: ");
                           int id=sc.nextInt();

                           sc.nextLine();
                           System.out.print("Name: ");
                           String name=sc.nextLine();

                           System.out.print("Email: ");
                           String email=sc.nextLine();

                           System.out.print("Address: ");
                           String Add=sc.nextLine();

                           System.out.print("Contact: ");
                           long con=sc.nextLong();

                           System.out.print("Salary: ");
                           int salary=sc.nextInt();

                           e[i].setId(id);
                           e[i].setName(name);
                           e[i].setEmail(email);
                           e[i].setAddr(Add);
                           e[i].setContact(con);
                           e[i].setSalary(salary);
                        }
                       break;
                    }

                     case 2://Show Employee Details.
                      {
                        
                        if(c!=0)
                         {
                           Company c1=new Company(e);
                           c1.showEmployeeDetail(count);
                         }
                        else
                         {
                           System.out.println("\nNo Employee Detail:");
                         } 
                        break;
                      }

                    case 3://.Search Employee Using:
                     {
                       if(c!=0)
                        {
                         
                          int id,salary;
                          String name,email,add;
                          
                          int choice1;
                          System.out.println("press 1:--> Search by ID.");
                          System.out.println("press 2:--> Search by Name.");
                          System.out.println("press 3:--> Search by Email.");
                          System.out.println("press 4:--> Search by Salary.");
                          System.out.println("press 5:--> Search by Address.\n");

                          System.out.print("Enter Choice For Search: ");
                          choice1=sc.nextInt();
                           switch(choice1)
                           {
                           case 1:
                             {
                                System.out.print("Enter ID: ");
                                 id=sc.nextInt();
                                Company c1=new Company(e);
                                c1. searchEmployee(choice1,id,name=null,count);
                                break;
                             }

                            case 2:
                             {
                                sc.nextLine();
                                System.out.print("Enter Name: ");
                                name=sc.nextLine();
				Company c1=new Company(e);
                               c1. searchEmployee(choice1,id=0,name,count);
                                break;
                             }

                            case 3:
                             {   sc.nextLine();
                                System.out.print("Enter Email: ");
                                email=sc.nextLine();
                                Company c1=new Company(e);
                                c1. searchEmployee(choice1,id=0,email,count);
                                break;
                             }

                            case 4:
                             {
                                 
                                System.out.print("Enter Salary: ");
                                salary=sc.nextInt();
                                Company c1=new Company(e);
                                c1. searchEmployee(choice1,salary,name=null,count);
                                break;
                             }

                            case 5:
                             {
                                sc.nextLine();
                                System.out.print("Enter Address: ");
                                add=sc.nextLine();
                                Company c1=new Company(e);
                                c1. searchEmployee(choice1,id=0,add,count);
                                break;
                             }

                            default:
                            {
                              System.out.println("\nWrong Choice");
                              break;
                            }

                           }
                         }
                       else
                         {
                             System.out.println("\nNo Employee Detail:");
                         }
                       break;
                     }

                    case 4://.Delete Employee Details Using:
                     {count++;
                        if(c!=0)
                         {  
                             int id,salary;
                             String name,email,add;

                             int choice1;
                             System.out.println("press 1:--> Delete by ID. ");
                            System.out.println("press 2:--> Delete by Name: press.");
                            System.out.println("press 3:--> Delete by Email: press. ");
                            System.out.println("press 4:--> Delete by Salary: press. ");
                            System.out.println("press 5:--> Delete by Address: press. \n");


                            
                           System.out.print("Enter Choice For Delete: ");
                            choice1=sc.nextInt();
                           switch(choice1)
                           {
                           case 1:
                             {
                                 
                                System.out.print("Enter ID: ");
                                 id=sc.nextInt();
                                 
                                Company c1=new Company(e);
                                c1.DeleteEmployeeDetail(choice1,id,name=null,count);
                                
                                break;
                             }

                            case 2:
                             {
                                sc.nextLine();
                                System.out.print("Enter Name: ");
                                name=sc.nextLine();
                                Company c1=new Company(e);
                                c1.DeleteEmployeeDetail(choice1,id=0,name,count);
                                break;
                             }

                            case 3:
                             {   sc.nextLine();
                                System.out.print("Enter Email: ");
                                email=sc.nextLine();
                                Company c1=new Company(e);
                                c1.DeleteEmployeeDetail(choice1,id=0,email,count);
                                break;
                             }

                            case 4:
                             {
                                 
                                System.out.print("Enter Salary: ");
                                salary=sc.nextInt();
                                Company c1=new Company(e);
                                c1.DeleteEmployeeDetail(choice1,salary,name=null,count);
                                break;
                             }

                            case 5:
                             {
                                sc.nextLine();
                                System.out.print("Enter Address: ");
                                add=sc.nextLine();
                                Company c1=new Company(e);
                                c1.DeleteEmployeeDetail(choice1,id=0,add,count);
                                break;
                             }

                           default:
                            {
                              System.out.println("\nWrong Choice");
                              break;
                            }

                         }
                       }
                        else
                         {
                            System.out.println("\nNo Employee Detail:");
                         }
                        break;
                     }

                     case 5://Update Employee Details Using:
                     {
                        if(c!=0)
                         {  
                             int id,salary;
                             String name,email,add;

                             int choice1;
                             System.out.println("press 1:--> Update by ID.");
                            System.out.println("press 2:--> Update by Name.");
                            System.out.println("press 3:--> Update by Email.");
                            System.out.println("press 4:--> Update by Salary.");
                            System.out.println("press 5:--> Update by Address.\n");


                            
                           System.out.print("Enter Choice For Update: ");
                            choice1=sc.nextInt();
                           switch(choice1)
                           {
                           case 1:
                             {
                                 
                                System.out.print("Enter ID: ");
                                 id=sc.nextInt();
                                 
                                Company c1=new Company(e);
                                c1.updateEmployee(choice1,id,name=null,count);
                                
                                break;
                             }

                            case 2:
                             {
                                sc.nextLine();
                                System.out.print("Enter Name: ");
                                name=sc.nextLine();
                                Company c1=new Company(e);
                                c1.updateEmployee(choice1,id=0,name,count);
                                break;
                             }

                            case 3:
                             {   sc.nextLine();
                                System.out.print("Enter Email: ");
                                email=sc.nextLine();
                                Company c1=new Company(e);
                                c1.updateEmployee(choice1,id=0,email,count);
                                break;
                             }

                            case 4:
                             {
                                 
                                System.out.print("Enter Salary: ");
                                salary=sc.nextInt();
                                Company c1=new Company(e);
                                c1.updateEmployee(choice1,salary,name=null,count);
                                break;
                             }

                            case 5:
                             {
                                sc.nextLine();
                                System.out.print("Enter Address: ");
                                add=sc.nextLine();
                                Company c1=new Company(e);
                                c1.updateEmployee(choice1,id=0,add,count);
                                break;
                             }
                         
                            default:
                            {
                              System.out.println("\nWrong Choice");
                              break;
                            }
                         }
                       }
                        else
                         {
                            System.out.println("\nNo Employee Detail:");
                         }
                        break;
                     }

                   case 6://Shorting Employee Detail.
                     {
                        if(c!=0)
                         {
                            int choice1;
                            System.out.println("Press:1---> Id By Ascending Order.");
                            System.out.println("Press:2---> Salary By Desceding Order.\n");

                            System.out.print("Enter Choice: ");
                            choice1=sc.nextInt();

                            switch(choice1)
                              {
                                  case 1:
                                   {
                                      System.out.print("Enter Id: ");
                                      int id=sc.nextInt();
                                      Company c1=new Company(e);
                                      c1.SortingEmployee(choice1,id,count);
                                      break;
                                   }

                                  case 2:
                                   {
                                      System.out.print("Enter Salary: ");
                                      int Salary=sc.nextInt();
                                      Company c1=new Company(e);
                                      c1.SortingEmployee(choice1,Salary,count);
                                      break;
                                   }

                                   default:
                                    {
                                       System.out.println("\nWrong Choice");
                                       break;
                                    }

                              }
                         }
                       else
                         {
                            System.out.println("\nNo Employee Detail:");
                         }
                       break;
                     }

                    //Display the employee details in highest salary.

                    case 7:
                     {
                       if(c!=0)
                         {
                           Company c1=new Company(e);
                           c1.HighestSalary(count);
                         }
                       else
                         {
                            System.out.println("\nNo Employee Detail:");
                         }
                       break;
                     }

                    // Display the employee details in second highest salary.

                     case 8:
                      {
                         if(c!=0)
                          {
                              Company c1=new Company(e);
                              c1.SecondHighestSalary(count);
                          }
                         else
                          {
                             System.out.println("\nNo Employee Detail:");
                          }
                        break;
                      }

                    case 9:
                     {
                        if(c!=0)
                          {
                              Company c1=new Company(e);
                              c1.MiniMaxSalay(count);
                          }
                        else
                          {
                              System.out.println("\nNo Employee Detail:");
                          }
                        break;
                     }

                    default:
                     {
                        System.out.println("\nWrong Choice");
                        break;
                     }
              }// close switch 
          }while(choice<=10 && choice!=0);
  }
}