
### About docker-compose.yml

KAFKA_ADVERTISED_HOST_NAME is your docker host ip

```bash
KAFKA_ADVERTISED_HOST_NAME: 192.168.0.101
```

### How to use kafka cli in this example?

```bash
docker exec -it your_kafka_container_id bash
```

By default, there is order topic created automated

### CLI

 ```bash
kafka-topics.sh --zookeeper zookeeper:2181 --describe
```

```bash
kafka-topics.sh --zookeeper zookeeper:2181 --topic order --delete
```

```bash
kafka-topics.sh --zookeeper zookeeper:2181 --topic order --create --partitions 3 --replication-factor 1
```

```bash
kafka-console-producer.sh --broker-list 192.168.0.101:9092 --topic order
```