import { Component} from '@angular/core';
import { Router} from '@angular/router';
import { Employee} from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-add-employee',
  template: `
    <h2 class="text-center m-5">Add a New Employee</h2>
    <app-employee-form (formSubmitted)="addEmployee($event)"></app-employee-form>
  `
})
export class AddEmployeeComponent {

  constructor(
    private employeeService: EmployeeService,
    private router: Router
  ) { }

  addEmployee(employee: Employee) {
    this.employeeService.createEmployee(employee)
      .subscribe( {
        next: () => {
          this.router.navigate(['/employees']);
        },
        error: (err) => {
          alert("Failed to create employee");
          console.error(err)
      }
    });
  }

}
