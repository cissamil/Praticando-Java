/* 
    Carro:
        Ligar o carro;
        Desligar o carro;
        Acelerar;
        diminuir velocidade;
        virar para esquerda/direita
        verificar velocidade;
        trocar a marcha

Regras:
    1) Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
    2) O carro desligado não pode realizar nenhuma função;

    3) Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
    4) Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no minimo a 0km);

    5) o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
    
    6) A velocidade do carro deve respeitar os seguintes limites para cada velocidade
        se estiver na 0 (ponto morto) ele não pode acelerar
        se estiver na 1ª  0km e 20km
        se estiver na 2ª  21km e 40km
        se estiver na 3ª  41km e 60km
        se estiver na 4ª  61km e 80km
        se estiver na 5ª  81km e 100km
        se estiver na 6ª  101km e 120km
    
    7) O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
    8) O carro só pode virar para esquerda/direita se sua velocidade for de no mínimo 1km e no máximo 40km;

*/

package carro;

public class Carro {
    
    
}
