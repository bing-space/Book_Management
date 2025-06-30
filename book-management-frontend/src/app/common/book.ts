export class Book {
    constructor(
        public name: string,
        public image: string,
        public date_add: Date,
        public date_finish: Date,
        public authorName: string,
        public statusType: string
    ){}
}
