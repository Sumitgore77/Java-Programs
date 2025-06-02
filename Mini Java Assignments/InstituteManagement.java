// Institute management System
import java.util.Scanner;

class Course {
    int courseId;
    String courseName;
    int batchId;

    Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.batchId = -1; // No batch allocated by default
    }
}

class Enquiry {
    int enquiryId;
    int courseId;
    boolean status;

    Enquiry(int enquiryId) {
        this.enquiryId = enquiryId;
        this.status = false; // Default status is false
        this.courseId = -1; // No course allocated by default
    }
}

class Batch {
    int batchId;
    String batchName;

    Batch(int batchId, String batchName) {
        this.batchId = batchId;
        this.batchName = batchName;
    }
}

public class InstituteManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course[] courses = new Course[3];
        System.out.println("Enter how many Enquiry");
        int size=sc.nextInt();
        Enquiry[] enquiries = new Enquiry[size];
        Batch batch = null;
        int admissionCount = 0;

        while (true) {
            System.out.println("\n---- Institute Management Application ----");
            System.out.println("1. Add New Courses");
            System.out.println("2. Take Enquiry");
            System.out.println("3. Enroll For Admission");
            System.out.println("4. Allocate Batch");
            System.out.println("5. View All Courses");
            System.out.println("6. View Course Wise Students");
            System.out.println("7. View Batch Wise Students");
            System.out.println("8. View All Enquiries");
            System.out.println("9. View All Admissions");
            System.out.println("10. View Cancel Enquiry");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Add 3 courses:");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Enter course ID: ");
                        int courseId = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Enter course name: ");
                        String courseName = sc.nextLine();

                        courses[i] = new Course(courseId, courseName);
                    }
                    System.out.println("Courses added successfully.");
                    break;

                case 2:
                    // Take Enquiry
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Enter enquiry ID: ");
                        int enquiryId = sc.nextInt();

                        // Ensure enquiry ID is unique
                        boolean isDuplicate = false;
                        for (int j = 0; j < i; j++) {
                            if (enquiries[j].enquiryId == enquiryId) {
                                isDuplicate = true;
                                break;
                            }
                        }

                        if (isDuplicate) {
                            System.out.println("Enquiry ID already exists. Try again.");
                            i--;
                            continue;
                        }

                        enquiries[i] = new Enquiry(enquiryId);
                    }

                    // Show all courses
                    System.out.println("Available courses:");
                    for (Course course : courses) {
                        System.out.println("Course ID: " + course.courseId + ", Name: " + course.courseName);
                    }

                    // Allocate course to enquiries
                    for (Enquiry enquiry : enquiries) {
                        System.out.print("Enter course ID to allocate for Enquiry ID " + enquiry.enquiryId + ": ");
                        int courseId = sc.nextInt();
                        enquiry.courseId = courseId;
                    }

                    System.out.println("Enquiries processed successfully.");
                    break;

                case 3:
                    // Enroll For Admission
                    System.out.println("All enquiries:");
                    for (Enquiry enquiry : enquiries) {
                        System.out.println("Enquiry ID: " + enquiry.enquiryId + ", Course ID: " + enquiry.courseId + ", Status: " + enquiry.status);
                    }

                    System.out.print("Enter enquiry ID for admission: ");
                    int enquiryIdForAdmission = sc.nextInt();
                    boolean found = false;
                    for (Enquiry enquiry : enquiries) {
                        if (enquiry.enquiryId == enquiryIdForAdmission) {
                            enquiry.status = true;
                            found = true;
                            admissionCount++;
                            break;
                        }
                    }

                    if (found) {
                        System.out.println("Enquiry ID " + enquiryIdForAdmission + " enrolled for admission.");
                    } else {
                        System.out.println("Invalid enquiry ID.");
                    }
                    break;

                case 4:
                    // Allocate Batch
                    System.out.print("Enter batch ID: ");
                    int batchId = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter batch name: ");
                    String batchName = sc.nextLine();
                    batch = new Batch(batchId, batchName);

                    // Show all courses
                    System.out.println("Available courses:");
                    for (Course course : courses) {
                        System.out.println("Course ID: " + course.courseId + ", Name: " + course.courseName);
                    }

                    System.out.print("Enter course ID to allocate batch: ");
                    int courseIdForBatch = sc.nextInt();
                    for (Course course : courses) {
                        if (course.courseId == courseIdForBatch) {
                            course.batchId = batchId;
                            break;
                        }
                    }

                    System.out.println("Batch allocated to course successfully.");
                    break;

                case 5:
                    // View All Courses
                    System.out.println("All courses:");
                    for (Course course : courses) {
                        System.out.println("Course ID: " + course.courseId + ", Name: " + course.courseName);
                    }
                    break;

                case 6:
                    // View Course Wise Students
                    System.out.println("Students enrolled course-wise:");
                    for (Course course : courses) {
                        System.out.println("Course ID: " + course.courseId + ", Name: " + course.courseName);
                        for (Enquiry enquiry : enquiries) {
                            if (enquiry.courseId == course.courseId && enquiry.status) {
                                System.out.println("  Enquiry ID: " + enquiry.enquiryId);
                            }
                        }
                    }
                    break;

                case 7:
                    // View Batch Wise Students
                    if (batch == null) {
                        System.out.println("No batch allocated yet.");
                    } else {
                        System.out.println("Batch ID: " + batch.batchId + ", Name: " + batch.batchName);
                        for (Enquiry enquiry : enquiries) {
                            for (Course course : courses) {
                                if (course.batchId == batch.batchId && enquiry.courseId == course.courseId && enquiry.status) {
                                    System.out.println("  Enquiry ID: " + enquiry.enquiryId);
                                }
                            }
                        }
                    }
                    break;

                case 8:
                    // View All Enquiries
                    System.out.println("All enquiries:");
                    for (Enquiry enquiry : enquiries) {
                        System.out.println("Enquiry ID: " + enquiry.enquiryId + ", Course ID: " + enquiry.courseId + ", Status: " + enquiry.status);
                    }
                    break;

                case 9:
                    // View All Admissions
                    System.out.println("All admissions:");
                    for (Enquiry enquiry : enquiries) {
                        if (enquiry.status) {
                            System.out.println("Enquiry ID: " + enquiry.enquiryId + ", Course ID: " + enquiry.courseId);
                        }
                    }
                    break;

                case 10:
                    // View Cancel Enquiry
                    System.out.println("Cancelled enquiries:");
                    for (Enquiry enquiry : enquiries) {
                        if (!enquiry.status) {
                            System.out.println("Enquiry ID: " + enquiry.enquiryId + ", Course ID: " + enquiry.courseId);
                        }
                    }
                    break;

                case 0:
                    // Exit
                    System.out.println("Exiting application.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again");
                    break;
            }
        }
    }
}


