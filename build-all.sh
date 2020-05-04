
build_maven(){
echo "Building all maven projects..."
for i in $(find -name "pom.xml" -type f -print)
do
	mvn -f $i clean package -DskipTests
done
}

build_images(){
echo "Building docker images..."
cd ms-container-demo
docker-compose build
}


run_services(){
cd ms-container-demo
docker-compose down
echo "Running the docker containers!"
docker-compose up -d
echo "List of all resources..."
docker-compose ps
eureka_port=$(docker-compose port eureka 8761 | cut -f2 -d":" )
echo "Access Eureka Dashboard at http://localhost:${eureka_port}"
hello_port=$(docker-compose port hello-srv 80 | cut -f2 -d":" )
echo "Access Hello Service at http://localhost:${hello_port}"
client_port=$(docker-compose port client 80 | cut -f2 -d":" )
echo "Access Client Service at http://localhost:${client_port}"
}

case $1 in
	mvn)
	echo "Building Java project using maven"
	build_maven
	;;

	image)
	echo "Building new container images"
	build_images
	;;

	run)
	echo "Running services using docker-compose"
	run_services
	;;

	*)
	echo "Clean build .... "
	build_maven
	build_images
	run_services
	;;
esac
