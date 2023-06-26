CREATE TABLE Event(
    id int unique auto_increment,
    title varchar(255),
    place varchar(255),
    speaker varchar(255),
    event_type varchar(255),
    date_event date
);

INSERT INTO Event (title, place, speaker, event_type, date_event) VALUES ('F1', 'Monaco', 'Verstappen', 'Race', '2023-06-25');
INSERT INTO Event (title, place, speaker, event_type, date_event) VALUES ('Soccer', 'Miami', 'Messi', 'Match', '2023-07-22');
INSERT INTO Event (title, place, speaker, event_type, date_event) VALUES ('Basketball', 'LA', 'Davis', 'Playoff', '2023-06-07');
