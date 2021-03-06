DROP TABLE PATIENTEN;
DROP TABLE AERZTE;

CREATE TABLE AERZTE(
	Personalnummer INTEGER PRIMARY KEY AUTO_INCREMENT,
	Name VARCHAR(40) NOT NULL,
	Fachgebiet VARCHAR(40) NOT NULL,
	Buero VARCHAR(40) NOT NULL,
	Email VARCHAR(255) NOT NULL,
	Passwort VARCHAR(255) NOT NULL
)
CREATE TABLE PATIENTEN(
	PatientenId INTEGER PRIMARY KEY AUTO_INCREMENT,
	Name VARCHAR(40) NOT NULL,
	Geburtsdatum VARCHAR(40) NOT NULL
	
)

CREATE TABLE BEHANDLUNG(
PatientenId INTEGER,
Diagnose VARCHAR(40) NOT NULL,
Behandelnderarzt INTEGER NOT NULL)


ALTER TABLE BEHANDLUNG
ADD FOREIGN KEY (Behandelnderarzt) REFERENCES Aerzte(Personalnummer)
ALTER TABLE BEHANDLUNG
ADD FOREIGN KEY (PatientenId) REFERENCES Patienten(PatientenId)

SELECT * FROM AERZTE
SELECT * FROM Patienten