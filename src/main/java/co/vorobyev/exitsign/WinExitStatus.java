/*
Copyright 2015 Anton Vorobyev
Licensed under the Apache License, Version 2.0 (the "License");

you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*/

package co.vorobyev.exitsign;

/**
 * Enumeration class collecting exit statuses peculiar to Windows software.
 *
 * <p>In fact it is a wrapper-collector of default ExitStatus implementation.</p>
 *
 * <p>It is is mirror of constants from {@code sysexits.h}.</p>
 *
 * @author <a href="http://vorobyev.co">Anton Vorobyev</a>
 * @see <a href="http://msdn.microsoft.com/en-us/library/ms681381(v=vs.85).aspx"> Windows Error
 * Codes</a>
 * @since 0.1
 */
public class WinExitStatus extends ExitStatus {

  /**
   * Successful termination.
   */
  public static final ExitStatus SUCCESS;

  /**
   * Incorrect function.
   */
  public static final ExitStatus INVALID_FUNCTION;

  /**
   * The system cannot find the file specified.
   */
  public static final ExitStatus FILE_NOT_FOUND;

  /**
   * The system cannot find the path specified.
   */
  public static final ExitStatus PATH_NOT_FOUND;

  /**
   * The system cannot open the file.
   */
  public static final ExitStatus TOO_MANY_OPEN_FILES;

  /**
   * Access is denied.
   */
  public static final ExitStatus ACCESS_DENIED;

  /**
   * The handle is invalid.
   */
  public static final ExitStatus INVALID_HANDLE;

  /**
   * The storage control blocks were destroyed.
   */
  public static final ExitStatus ARENA_TRASHED;

  /**
   * Not enough storage is available to process this command.
   */
  public static final ExitStatus NOT_ENOUGH_MEMORY;

  /**
   * The storage control block address is invalid.
   */
  public static final ExitStatus INVALID_BLOCK;

  /**
   * The environment is incorrect.
   */
  public static final ExitStatus BAD_ENVIRONMENT;

  /**
   * An attempt was made to load a program with an incorrect format.
   */
  public static final ExitStatus BAD_FORMAT;

  /**
   * The access code is invalid.
   */
  public static final ExitStatus INVALID_ACCESS;

  /**
   * The data is invalid.
   */
  public static final ExitStatus INVALID_DATA;

  /**
   * Not enough storage is available to complete this operation.
   */
  public static final ExitStatus OUTOFMEMORY;

  /**
   * The system cannot find the drive specified.
   */
  public static final ExitStatus INVALID_DRIVE;

  /**
   * The directory cannot be removed.
   */
  public static final ExitStatus CURRENT_DIRECTORY;

  /**
   * The system cannot move the file to a different disk drive.
   */
  public static final ExitStatus NOT_SAME_DEVICE;

  /**
   * There are no more files.
   */
  public static final ExitStatus NO_MORE_FILES;

  /**
   * The media is write protected.
   */
  public static final ExitStatus WRITE_PROTECT;

  /**
   * The system cannot find the device specified.
   */
  public static final ExitStatus BAD_UNIT;

  /**
   * The device is not ready.
   */
  public static final ExitStatus NOT_READY;

  /**
   * The device does not recognize the command.
   */
  public static final ExitStatus BAD_COMMAND;

  /**
   * Data error (cyclic redundancy check).
   */
  public static final ExitStatus CRC;

  /**
   * The program issued a command but the command length is incorrect.
   */
  public static final ExitStatus BAD_LENGTH;

  /**
   * The drive cannot locate a specific area or track on the disk.
   */
  public static final ExitStatus SEEK;

  /**
   * The specified disk or diskette cannot be accessed.
   */
  public static final ExitStatus NOT_DOS_DISK;

  /**
   * The drive cannot find the sector requested.
   */
  public static final ExitStatus SECTOR_NOT_FOUND;

  /**
   * The printer is out of paper.
   */
  public static final ExitStatus OUT_OF_PAPER;

  /**
   * The system cannot write to the specified device.
   */
  public static final ExitStatus WRITE_FAULT;

  /**
   * The system cannot read from the specified device.
   */
  public static final ExitStatus READ_FAULT;

  /**
   * A device attached to the system is not functioning.
   */
  public static final ExitStatus GEN_FAILURE;

  /**
   * The process cannot access the file because it is being used by another process.
   */
  public static final ExitStatus SHARING_VIOLATION;

  /**
   * The process cannot access the file because another process has locked a portion of the file.
   */
  public static final ExitStatus LOCK_VIOLATION;

  /**
   * The wrong diskette is in the drive.
   */
  public static final ExitStatus WRONG_DISK;

  /**
   * Too many files opened for sharing.
   */
  public static final ExitStatus SHARING_BUFFER_EXCEEDED;

  /**
   * Reached the end of the file .
   */
  public static final ExitStatus HANDLE_EOF;

  /**
   * The disk is full.
   */
  public static final ExitStatus HANDLE_DISK_FULL;

  /**
   * The request is not supported.
   */
  public static final ExitStatus NOT_SUPPORTED;

  /**
   * Windows cannot find the network path.
   */
  public static final ExitStatus REM_NOT_LIST;

  /**
   * You were not connected because a duplicate name exists on the network.
   */
  public static final ExitStatus DUP_NAME;

  /**
   * The network path was not found.
   */
  public static final ExitStatus BAD_NETPATH;

  /**
   * The network is busy.
   */
  public static final ExitStatus NETWORK_BUSY;

  /**
   * The specified network resource or device is no longer available.
   */
  public static final ExitStatus DEV_NOT_EXIST;

  /**
   * The network BIOS command limit has been reached.
   */
  public static final ExitStatus TOO_MANY_CMDS;

  /**
   * A network adapter hardware error occurred.
   */
  public static final ExitStatus ADAP_HDW_ERR;

  /**
   * The specified server cannot perform the requested operation.
   */
  public static final ExitStatus BAD_NET_RESP;

  /**
   * An unexpected network error occurred.
   */
  public static final ExitStatus UNEXP_NET_ERR;

  /**
   * The remote adapter is not compatible.
   */
  public static final ExitStatus BAD_REM_ADAP;

  /**
   * The printer queue is full.
   */
  public static final ExitStatus PRINTQ_FULL;

  /**
   * Space to store the file waiting to be printed is not available on the server.
   */
  public static final ExitStatus NO_SPOOL_SPACE;

  /**
   * Your file waiting to be printed was deleted.
   */
  public static final ExitStatus PRINT_CANCELLED;

  /**
   * The specified network name is no longer available.
   */
  public static final ExitStatus NETNAME_DELETED;

  /**
   * Network access is denied.
   */
  public static final ExitStatus NETWORK_ACCESS_DENIED;

  /**
   * The network resource type is not correct.
   */
  public static final ExitStatus BAD_DEV_TYPE;

  /**
   * The network name cannot be found.
   */
  public static final ExitStatus BAD_NET_NAME;

  /**
   * The name limit for the local computer network adapter card was exceeded.
   */
  public static final ExitStatus TOO_MANY_NAMES;

  /**
   * The network BIOS session limit was exceeded.
   */
  public static final ExitStatus TOO_MANY_SESS;

  /**
   * The remote server has been paused or is in the process of being started.
   */
  public static final ExitStatus SHARING_PAUSED;

  /**
   * No more connections can be made to this remote computer at this time because there are already
   * as many connections as the computer can accept.
   */
  public static final ExitStatus REQ_NOT_ACCEP;

  /**
   * The specified printer or disk device has been paused.
   */
  public static final ExitStatus REDIR_PAUSED;

  /**
   * The file exists.
   */
  public static final ExitStatus FILE_EXISTS;

  /**
   * The directory or file cannot be created.
   */
  public static final ExitStatus CANNOT_MAKE;

  /**
   * Fail on INT 24.
   */
  public static final ExitStatus FAIL_I24;

  /**
   * Storage to process this request is not available.
   */
  public static final ExitStatus OUT_OF_STRUCTURES;

  /**
   * The local device name is already in use.
   */
  public static final ExitStatus ALREADY_ASSIGNED;

  /**
   * The specified network password is not correct.
   */
  public static final ExitStatus INVALID_PASSWORD;

  /**
   * The parameter is incorrect.
   */
  public static final ExitStatus INVALID_PARAMETER;

  /**
   * A write fault occurred on the network.
   */
  public static final ExitStatus NET_WRITE_FAULT;

  /**
   * The system cannot start another process at this time.
   */
  public static final ExitStatus NO_PROC_SLOTS;

  /**
   * Cannot create another system semaphore.
   */
  public static final ExitStatus TOO_MANY_SEMAPHORES;

  /**
   * The exclusive semaphore is owned by another process.
   */
  public static final ExitStatus EXCL_SEM_ALREADY_OWNED;

  /**
   * The semaphore is set and cannot be closed.
   */
  public static final ExitStatus SEM_IS_SET;

  /**
   * The semaphore cannot be set again.
   */
  public static final ExitStatus TOO_MANY_SEM_REQUESTS;

  /**
   * Cannot request exclusive semaphores at interrupt time.
   */
  public static final ExitStatus INVALID_AT_INTERRUPT_TIME;

  /**
   * The previous ownership of this semaphore has ended.
   */
  public static final ExitStatus SEM_OWNER_DIED;

  /**
   * Insert the diskette for drive.
   */
  public static final ExitStatus SEM_USER_LIMIT;

  /**
   * The program stopped because an alternate diskette was not inserted.
   */
  public static final ExitStatus DISK_CHANGE;

  /**
   * The disk is in use or locked by another process.
   */
  public static final ExitStatus DRIVE_LOCKED;

  /**
   * The pipe has been ended.
   */
  public static final ExitStatus BROKEN_PIPE;

  /**
   * The system cannot open the device or file specified.
   */
  public static final ExitStatus OPEN_FAILED;

  /**
   * The file name is too long.
   */
  public static final ExitStatus BUFFER_OVERFLOW;

  /**
   * There is not enough space on the disk.
   */
  public static final ExitStatus DISK_FULL;

  /**
   * No more internal file identifiers available.
   */
  public static final ExitStatus NO_MORE_SEARCH_HANDLES;

  /**
   * The target internal file identifier is incorrect.
   */
  public static final ExitStatus INVALID_TARGET_HANDLE;

  /**
   * The IOCTL call made by the application program is not correct.
   */
  public static final ExitStatus INVALID_CATEGORY;

  /**
   * The verify-on-write switch parameter value is not correct.
   */
  public static final ExitStatus INVALID_VERIFY_SWITCH;

  /**
   * The system does not support the command requested.
   */
  public static final ExitStatus BAD_DRIVER_LEVEL;

  /**
   * This function is not supported on this system.
   */
  public static final ExitStatus CALL_NOT_IMPLEMENTED;

  /**
   * The semaphore timeout period has expired.
   */
  public static final ExitStatus SEM_TIMEOUT;

  /**
   * The data area passed to a system call is too small.
   */
  public static final ExitStatus INSUFFICIENT_BUFFER;

  /**
   * The filename, directory name, or volume label syntax is incorrect.
   */
  public static final ExitStatus INVALID_NAME;

  /**
   * The system call level is not correct.
   */
  public static final ExitStatus INVALID_LEVEL;

  /**
   * The disk has no volume label.
   */
  public static final ExitStatus NO_VOLUME_LABEL;

  /**
   * The specified module could not be found.
   */
  public static final ExitStatus MOD_NOT_FOUND;

  /**
   * The specified procedure could not be found.
   */
  public static final ExitStatus PROC_NOT_FOUND;

  /**
   * There are no child processes to wait for.
   */
  public static final ExitStatus WAIT_NO_CHILDREN;

  static {
    ExitStatusBuilder builder = ExitStatusBuilderFactory.createBuilder();

    SUCCESS = builder.code(0).meaning("The operation completed successfully").build();

    INVALID_FUNCTION = builder.code(1).meaning("Incorrect function").build();

    FILE_NOT_FOUND = builder.code(2).meaning("The system cannot find the file specified").build();

    PATH_NOT_FOUND = builder.code(3).meaning("The system cannot find the path specified").build();

    TOO_MANY_OPEN_FILES = builder.code(4).meaning("The system cannot open the file").build();

    ACCESS_DENIED = builder.code(5).meaning("Access is denied").build();

    INVALID_HANDLE = builder.code(5).meaning("The handle is invalid").build();

    ARENA_TRASHED = builder.code(7).meaning("The storage control blocks were destroyed").build();

    NOT_ENOUGH_MEMORY = builder.code(8)
        .meaning("Not enough storage is available to process this command").build();

    INVALID_BLOCK = builder.code(9).meaning("The storage control block address is invalid").build();

    BAD_ENVIRONMENT = builder.code(10).meaning("The environment is incorrect").build();

    BAD_FORMAT = builder.code(10)
        .meaning("An attempt was made to load a program with an incorrect format").build();

    INVALID_ACCESS = builder.code(12).meaning("The access code is invalid").build();

    INVALID_DATA = builder.code(13).meaning("The data is invalid").build();

    OUTOFMEMORY = builder.code(14)
        .meaning("Not enough storage is available to complete this operation").build();

    INVALID_DRIVE = builder.code(15).meaning("The system cannot find the drive specified").build();

    CURRENT_DIRECTORY = builder.code(16).meaning("The directory cannot be removed").build();

    NOT_SAME_DEVICE = builder.code(17)
        .meaning("The system cannot move the file to a different disk drive").build();

    NO_MORE_FILES = builder.code(18).meaning("There are no more files").build();

    WRITE_PROTECT = builder.code(19).meaning("The media is write protected").build();

    BAD_UNIT = builder.code(20).meaning("The system cannot find the device specified").build();

    NOT_READY = builder.code(21).meaning("The device is not ready").build();

    BAD_COMMAND = builder.code(22).meaning("The device does not recognize the command").build();

    CRC = builder.code(23).meaning("Data error (cyclic redundancy check)").build();

    BAD_LENGTH = builder.code(24)
        .meaning("The program issued a command but the command length is incorrect").build();

    SEEK = builder.code(25)
        .meaning("The drive cannot locate a specific area or track on the disk").build();

    NOT_DOS_DISK = builder.code(26)
        .meaning("The specified disk or diskette cannot be accessed").build();

    SECTOR_NOT_FOUND = builder.code(27)
        .meaning("The drive cannot find the sector requested").build();

    OUT_OF_PAPER = builder.code(28).meaning("The printer is out of paper").build();

    WRITE_FAULT = builder.code(29)
        .meaning("The system cannot write to the specified device").build();

    READ_FAULT = builder.code(30)
        .meaning("The system cannot read from the specified device").build();

    GEN_FAILURE = builder.code(31)
        .meaning("A device attached to the system is not functioning").build();

    SHARING_VIOLATION = builder.code(32)
        .meaning("The process cannot access the file because it is being used by another process")
        .build();

    LOCK_VIOLATION = builder.code(33)
        .meaning("The process cannot access the file because another process has locked "
            + "a portion of the file")
        .build();

    WRONG_DISK = builder.code(34).meaning("The wrong diskette is in the drive").build();

    SHARING_BUFFER_EXCEEDED = builder.code(36).meaning("Too many files opened for sharing").build();

    HANDLE_EOF = builder.code(38).meaning("Reached the end of the file").build();

    HANDLE_DISK_FULL = builder.code(39).meaning("The disk is full").build();

    NOT_SUPPORTED = builder.code(50).meaning("The request is not supported").build();

    REM_NOT_LIST = builder.code(51).meaning("Windows cannot find the network path").build();

    DUP_NAME = builder.code(52)
        .meaning("You were not connected because a duplicate name exists on the network").build();

    BAD_NETPATH = builder.code(53).meaning("The network path was not found").build();

    NETWORK_BUSY = builder.code(54).meaning("The network is busy").build();

    DEV_NOT_EXIST = builder.code(55)
        .meaning("The specified network resource or device is no longer available").build();

    TOO_MANY_CMDS = builder.code(56)
        .meaning("The network BIOS command limit has been reached").build();

    ADAP_HDW_ERR = builder.code(57).meaning("A network adapter hardware error occurred").build();

    BAD_NET_RESP = builder.code(58)
        .meaning("The specified server cannot perform the requested operation").build();

    UNEXP_NET_ERR = builder.code(59).meaning("An unexpected network error occurred").build();

    BAD_REM_ADAP = builder.code(60).meaning("The remote adapter is not compatible").build();

    PRINTQ_FULL = builder.code(61).meaning("The printer queue is full").build();

    NO_SPOOL_SPACE = builder.code(62)
        .meaning("Space to store the file waiting to be printed is not available on the server")
        .build();

    PRINT_CANCELLED = builder.code(63)
        .meaning("Your file waiting to be printed was deleted").build();

    NETNAME_DELETED = builder.code(64)
        .meaning("The specified network name is no longer available").build();

    NETWORK_ACCESS_DENIED = builder.code(65).meaning("Network access is denied").build();

    BAD_DEV_TYPE = builder.code(66).meaning("The network resource type is not correct").build();

    BAD_NET_NAME = builder.code(67).meaning("The network name cannot be found").build();

    TOO_MANY_NAMES = builder.code(68)
        .meaning("The name limit for the local computer network adapter card was exceeded").build();

    TOO_MANY_SESS = builder.code(69).meaning("The network BIOS session limit was exceeded").build();

    SHARING_PAUSED = builder.code(70)
        .meaning("The remote server has been paused or is in the process of being started").build();

    REQ_NOT_ACCEP = builder.code(71)
        .meaning("No more connections can be made to this remote computer at this time because "
            + "there are already as many connections as the computer can accept")
        .build();

    REDIR_PAUSED = builder.code(72)
        .meaning("The specified printer or disk device has been paused").build();

    FILE_EXISTS = builder.code(80).meaning("The file exists").build();

    CANNOT_MAKE = builder.code(82).meaning("The directory or file cannot be created").build();

    FAIL_I24 = builder.code(83).meaning("Fail on INT 24").build();

    OUT_OF_STRUCTURES = builder.code(84)
        .meaning("Storage to process this request is not available").build();

    ALREADY_ASSIGNED = builder.code(85).meaning("The local device name is already in use").build();

    INVALID_PASSWORD = builder.code(86)
        .meaning("The specified network password is not correct").build();

    INVALID_PARAMETER = builder.code(87).meaning("The parameter is incorrect").build();

    NET_WRITE_FAULT = builder.code(88).meaning("A write fault occurred on the network").build();

    NO_PROC_SLOTS = builder.code(89)
        .meaning("The system cannot start another process at this time").build();

    TOO_MANY_SEMAPHORES = builder.code(100)
        .meaning("Cannot create another system semaphore").build();

    EXCL_SEM_ALREADY_OWNED = builder.code(101)
        .meaning("The exclusive semaphore is owned by another process").build();

    SEM_IS_SET = builder.code(102).meaning("The semaphore is set and cannot be closed").build();

    TOO_MANY_SEM_REQUESTS = builder.code(103).meaning("The semaphore cannot be set again").build();

    INVALID_AT_INTERRUPT_TIME = builder.code(104)
        .meaning("Cannot request exclusive semaphores at interrupt time").build();

    SEM_OWNER_DIED = builder.code(105)
        .meaning("The previous ownership of this semaphore has ended").build();

    SEM_USER_LIMIT = builder.code(106).meaning("Insert the diskette for drive").build();

    DISK_CHANGE = builder.code(107)
        .meaning("The program stopped because an alternate diskette was not inserted").build();

    DRIVE_LOCKED = builder.code(108)
        .meaning("The disk is in use or locked by another process").build();

    BROKEN_PIPE = builder.code(109).meaning("The pipe has been ended").build();

    OPEN_FAILED = builder.code(110)
        .meaning("The system cannot open the device or file specified").build();

    BUFFER_OVERFLOW = builder.code(111).meaning("The file name is too long").build();

    DISK_FULL = builder.code(112).meaning("There is not enough space on the disk").build();

    NO_MORE_SEARCH_HANDLES = builder.code(113)
        .meaning("No more internal file identifiers available").build();

    INVALID_TARGET_HANDLE = builder.code(114)
        .meaning("The target internal file identifier is incorrect").build();

    INVALID_CATEGORY = builder.code(117)
        .meaning("The IOCTL call made by the application program is not correct").build();

    INVALID_VERIFY_SWITCH = builder.code(118)
        .meaning("The system does not support the command requested").build();

    BAD_DRIVER_LEVEL = builder.code(119)
        .meaning("The system does not support the command requested").build();

    CALL_NOT_IMPLEMENTED = builder.code(120)
        .meaning("This function is not supported on this system").build();

    SEM_TIMEOUT = builder.code(121).meaning("The semaphore timeout period has expired").build();

    INSUFFICIENT_BUFFER = builder.code(122)
        .meaning("The data area passed to a system call is too small").build();

    INVALID_NAME = builder.code(123)
        .meaning("The filename, directory name, or volume label syntax is incorrect").build();

    INVALID_LEVEL = builder.code(124).meaning("The system call level is not correct").build();

    NO_VOLUME_LABEL = builder.code(125).meaning("The disk has no volume label").build();

    MOD_NOT_FOUND = builder.code(126).meaning("The specified module could not be found").build();

    PROC_NOT_FOUND = builder.code(127)
        .meaning("The specified procedure could not be found").build();

    WAIT_NO_CHILDREN = builder.code(128)
        .meaning("There are no child processes to wait for").build();

  }

  /**
   * Protected constructor, use on of the static methods to obtain a {@link ExitStatusBuilder}
   * instance and obtain a ExitStatus from that.
   */
  protected WinExitStatus() {
  }

  public WinExitStatus(int code) {
    super(code);
  }

  public WinExitStatus(int code, String meaning) {
    super(code, meaning);
  }

  public WinExitStatus(int code, String meaning, String comment) {
    super(code, meaning, comment);
  }

  /**
   * Create a new ExitStatusBuilder for successful exit status, set meaning description using the
   * supplied value.
   *
   * @param meaning the meaning description of exit status
   * @return a new ExitStatusBuilder
   */
  public static ExitStatusBuilder success(String meaning) {
    ExitStatusBuilder builder = fromStatus(SUCCESS).meaning(meaning);
    return builder;
  }

}
