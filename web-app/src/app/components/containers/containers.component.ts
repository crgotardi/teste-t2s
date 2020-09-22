import { Component, OnInit } from '@angular/core';
import { ContainersService } from 'src/app/services/containers.service';

@Component({
  selector: 'app-containers',
  templateUrl: './containers.component.html',
  styleUrls: ['./containers.component.scss']
})
export class ContainersComponent implements OnInit {

  containers: any;

  constructor(private service: ContainersService) { }

  ngOnInit(): void {
    this.list();
  }

  list() {
    this.service.list()
    .subscribe((containers) => {
      console.log(containers);
    })
  }
}