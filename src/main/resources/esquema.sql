drop table if exists series;

create table series ( id integer primary key AUTO_INCREMENT, nombre varchar(200) not null unique, descripcion text, imagen_url varchar(500) );

insert into series (nombre, descripcion, imagen_url) values
("The Nanny", "Una chica es contratada como niñera de 3 pequeños, y gracias a su extrovertida y y controversial personalidad termina conquistando a su jefe e hijos.","https://http2.mlstatic.com/the-nanny-la-ninera-serie-completa-digital-por-mega-D_NQ_NP_668873-MLM32034971216_092019-F.jpg");

insert into series (nombre, descripcion, imagen_url) values
("ALF", 
                "Un velludo extraterrestre sabelotodo y divertido tiene un accidente con su nave espacial, y es acogido por la familia Tanner donde aprende sobre la humanidad mientras trata de comerse al gato de la familia, una exquisitez en el planeta Melmac.",
                "https://e00-elmundo.uecdn.es/assets/multimedia/imagenes/2018/08/16/15344206335212.jpg");

insert into series (nombre, descripcion, imagen_url) values
("Ay como duele crecer", 
                "El psiquiatra Jason Seaver cría a su familia en los suburbios de Nueva York.",
                "http://www.gstatic.com/tv/thumb/tvbanners/184022/p184022_b_v8_ae.jpg");