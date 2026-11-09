Dentro de la carpeta src estan los 3 ejecutables
en la carpeta out/production/COLAS se encuentran los demas archivos necesarios

=== PRUEBA DE COLA ESTÁTICA LINEAL ===
Encolado en Cola Estática: 10
Encolado en Cola Estática: 20
Encolado en Cola Estática: 30
Frente -> [10] [20] [30] <- Fin
Elemento al frente (peek): 10
Desencolado de Cola Estática: 10
Frente -> [20] [30] <- Fin
Nuevo elemento al frente (peek): 20

Process finished with exit code 0

=== PRUEBA DE COLA DINÁMICA ===
Total de elementos iniciales: 0
Encolado en Cola Dinámica: 15
Encolado en Cola Dinámica: 25
Encolado en Cola Dinámica: 35
Encolado en Cola Dinámica: 45
Frente -> [15] [25] [35] [45] <- Fin
Elemento al frente (peek): 15
Total de elementos activos: 4
Desencolado de Cola Dinámica: 15
Frente -> [25] [35] [45] <- Fin
Nuevo frente (peek): 25
Total de elementos tras desencolar: 3

Process finished with exit code 0

=== PRUEBA DE COLA ESTÁTICA CIRCULAR ===
Encolado en Cola Circular: 100
Encolado en Cola Circular: 200
Encolado en Cola Circular: 300
Encolado en Cola Circular: 400
Frente -> [100] [200] [300] [400] <- Fin
Elemento al frente (peek): 100
Desencolado de Cola Circular: 100
Frente -> [200] [300] [400] <- Fin
Encolado en Cola Circular: 500
Frente -> [200] [300] [400] [500] <- Fin
Elemento al frente final (peek): 200

Process finished with exit code 0
