import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { Router, RouterModule } from "@angular/router";
import { studioRoutes } from "./studio.route";

@NgModule({
    imports: [CommonModule, RouterModule.forChild(studioRoutes)],
})

export class StudioModule {}