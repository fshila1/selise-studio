import { CommonModule } from "@angular/common";
import { Component } from "@angular/core";

@Component({
    selector: 'app-studio-list',
    standalone: true,
    templateUrl: './studio-list.component.html',
    styleUrl: './studio-list.component.scss',
    imports: [CommonModule]
})

export class StudioListComponent {
    studioList = [
        {
            "id": 4,
            "name": "Dhanmondi Recording Studio 1",
            "type": "recording_studio",
            "locationId": 1,
            "contactId": 4,
            "description": "A popular Recording Studio studio in Dhanmondi area.",
            "pricePerHour": 1500.00,
            "currency": "BDT",
            "rating": 4.5,
            "amenities": ["Instruments", "Instruments"],
            "images": ["https://images.pexels.com/photos/164938/pexels-photo-164938.jpeg"],
            "location": "Dhanmondi 27 No Bus Stop, Dhanmondi, Dhaka"
        },
        {
            "id": 5,
            "name": "Dhanmondi Art Studio 1",
            "type": "art_studio",
            "locationId": 2,
            "contactId": 5,
            "description": "A popular Art Studio studio in Dhanmondi area.",
            "pricePerHour": 1500.00,
            "currency": "BDT",
            "rating": 4.5,
            "amenities": ["Instruments", "Instruments"],
            "images": ["https://images.pexels.com/photos/164938/pexels-photo-164938.jpeg"],
            "location": "Dhanmondi 27 No Bus Stop, Dhanmondi, Dhaka"
        },
        {
            "id": 6,
            "name": "Gulshan Photography Studio 1",
            "type": "photography",
            "locationId": 3,
            "contactId": 6,
            "description": "A popular photography Studio studio in Gulshan area.",
            "pricePerHour": 1500.00,
            "currency": "BDT",
            "rating": 4.5,
            "amenities": ["Instruments", "Instruments"],
            "images": ["https://images.pexels.com/photos/164938/pexels-photo-164938.jpeg"],
            "location": "Dhanmondi 27 No Bus Stop, Dhanmondi, Dhaka"
        }
    ];

    bookStudio = (id: number) =>{

    }
}