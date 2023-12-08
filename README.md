# JavaEreditaAutoEs01

Traccia dell'esercizio sull'ereditarietà

Si richiede di sviluppare un programma in Java che modelli veicoli di diversi tipi. 
Si definiranno un'interfaccia Veicolo e due classi Automobile e Moto che implementano questa interfaccia. 
Si vuole gestire l'accelerazione, la decelerazione e l'arresto dei veicoli.

Requisiti:

1.	Classe Veicolo:
o	Definire una classe chiamata Veicolo che contenga i seguenti metodi:
L’unico field obbligatorio è velocita che verrà usato nei metodi.
	accelerare(int valore): aumenta la velocità del veicolo.
	decelerare(int valore): diminuisce la velocità del veicolo.
	fermarsi(): arresta il veicolo.
2.	Classe Automobile:
o	Estendere la classe Automobile che estende la classe Veicolo.
o	La classe Automobile dovrebbe avere un campo per la velocità attuale e implementare i metodi ereditati da Veicolo.
3.	Classe Moto:
o	Estendere la classe Moto che estende la classe Veicolo.
o	La classe Moto dovrebbe avere un campo per la velocità attuale e implementare i metodi ereditati da Veicolo.
4.	Test del programma:
o	Nel main del programma, creare almeno un'istanza di Automobile e una di Moto.
o	Utilizzare i metodi definiti per accelerare, decelerare e fermare i veicoli.
o	Stampare lo stato dei veicoli durante le operazioni.
