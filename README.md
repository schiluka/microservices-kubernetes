## Microservices example using kubernates with two services

#### start minikube
>minikube start

#### login to minikube
>minikube ssh

#### clone repo
>git clone https://github.com/schiluka/microservices-kubernetes.git

#### build images
>cd microservices-kubernetes/backend-service

>docker build --file=Dockerfile --tag=demo-backend:latest --rm=true .

>cd ../frontend-service

>docker build --file=Dockerfile --tag=demo-frontend:latest --rm=true .

>docker images | grep demo-frontend

>docker images | grep demo-backend

>exit

#### deploy pods from host
>kubectl create -f backend-deployment.yaml

>kubectl create -f frontend-deployment.yaml

#### verify deployments, pods, services
>kubectl get pods

>kubectl get deployments

>kubectl get services

#### list all services inside minikube
>minikube service list

#### open app - endpoint in browser
>minikube service demo-frontend

#### stop minikube
>minikube stop
