
### About docker-compose.yml

KAFKA_ADVERTISED_HOST_NAME is your docker host ip

```bash
KAFKA_ADVERTISED_HOST_NAME: 10.209.20.179
```

### How to use kafka cli in this example?

```bash
docker exec -it your_kafka_container_id bash
```

By default, there is order topic created automated
 ```bash
kafka-topics.sh --zookeeper zookeeper:2181 --describe
```
