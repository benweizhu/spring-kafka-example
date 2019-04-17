
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
kafka-console-producer.sh --broker-list localhost:9092 --topic order


>hello benwei

```

```bash
kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic order --from-beginning
```

```bash
kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic order --group my-group

kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic order --group my-second-group --from-beginning

// try it again
kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic order --group my-second-group --from-beginning
```
Kafka stores the offsets at which consumer group has been reading

```bash
kafka-consumer-groups.sh --bootstrap-server localhost:9092 --list

kafka-consumer-groups.sh --bootstrap-server localhost:9092 --describe --group my-second-group
```