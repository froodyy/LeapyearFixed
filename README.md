# LeapyearFixed
Oblig 3 software engineering og testing
Jeg har fått tilbakemelding fra oblig 2 om at jeg hadde et par mangler på testene mine og fikset opp i disse før jeg lastet opp det reviderte prosjektet her på GitHub. 
Opprettet workflow for Java ved bruk av Maven slik at oppgaver blir utført når det blir pushet/pullet til repositoriet ved litt omgjøring på pom.xml filen, har sørget for at actions er tilgjengelig og public slik som oblig 3 har satt som krav.

Etter at jeg prøvde å pushe til repositoriet så feilet builden til Maven flere ganger, gikk så gjennom pom.xml-filen og merket at maven compileren var satt til JDK 19 istedenfor 17 slik som .yml-filen krevde.
Oppdaterte så dette for at buildingen til Maven i workflow requesten skulle fungere og den fungerte nå.
Testet så om builden ville kjøre dersom testene ville bevisst gi feile expected argumenter og dette reflekteres gjennom actions-historikken.
