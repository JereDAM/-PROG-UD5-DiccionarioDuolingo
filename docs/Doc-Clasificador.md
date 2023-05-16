# Clasificador

Esta clase tiene un par de atributos varios metodos, que nos permiten tanto añadir palabras, como quitarlas, etc.

## anadirPalabra
Este método en sí, no devuelve nada. Se le pasa una palabra, esta palabra se limpia, es decir, se convierte
todo a minuscula y se le quitan los espacios, esto nos evitará algunos errores.
A continuación, comprobamos si en el diccionario existe una lista con la letra que se le pasa al metodo,
si la lista existe, lo único que hace es añadir la palabra a la lista correspondiente, si no, se crea una lista nueva, y en ella se meterá la nueva palabra que le hayamos pasado anteriormente.

## eliminarPalabra
A este método se le pasará una palabra, la que queramos eliminar, lo que hará, será buscar en
la lista, si tiene alguna letra inicial que sea igual a la primera letra de la palabra que le
hayamos pasado, si la encuentra, buscará dentro de esa lista la palabra que queramos eliminar,
si esta, localiza la palabra, la eliminará, si no, mostrará un mensaje por pantalla, lo mismo 
pasará si no encuentra la letra inicial. 

Este método también eliminará un set que contenga la lista si este set se encuentra
completamente vacío.

## comprobarExistePalabra
A este método, como el resto, se le pasará una palabra, este buscará en la lista, si la inicial
está presente, si no lo está, querrá decir directamente que la palabra que busca no existe.
Pero si encuentra la inicial, el metodo entrará en el set para buscarla, si no la encuentra,
imprimirá por pantalla el mismo mensaje que en el anterior caso, si la encuentra, mostrará
un mensaje informando al usuario que la palabra se ha encontrado.

## mostrarPalabrasInicial
A este método se le pasará una letra, este, comprobará que hay un set que se llame de la misma
manera que la letra que le hemos pasado. Si la encuentra, mostrará por pantalla todas aquellas
palabras que empiecen por la letra que le hemos pasado. 
Si no, mostrará un mensaje por pantalla diciendo que la letra no se encuentra en la lista.

## mostrarLetras
Este método lo único que hará es comprobar si el diccionario está vacío o no, si está vacío
mostrará un mensaje por pantalla diciendolo, si no lo está, este mostrará las letras que hay
actualmente en el diccionario.